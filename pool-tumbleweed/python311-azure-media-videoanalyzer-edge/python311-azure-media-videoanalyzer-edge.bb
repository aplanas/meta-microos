SUMMARY = "Microsoft Azure Video Analyzer Edge SDK Library for Python"
DESCRIPTION = "Azure Video Analyzer provides a platform to build intelligent video applications that span the edge and \
the cloud. The platform offers the capability to capture, record, and analyze live video along with \
publishing the results, video and video analytics, to Azure services in the cloud or the edge. It is \
designed to be an extensible platform, enabling you to connect different video analysis edge modules \
(such as Cognitive services containers, custom edge modules built by you with open-source machine \
 learning models or custom models trained with your own data) to it and use them to analyze live video \
without worrying about the complexity of building and running a live video pipeline. \
 \
Use the client library for Video Analyzer Edge to: \
 \
* Simplify interactions with the Microsoft Azure IoT SDKs \
* Programmatically construct pipeline topologies and live pipelines"
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python311-azure-media-videoanalyzer-edge-1.0.0b4-1.5.noarch.rpm"
RPM_HASH = "2c27c5e3e5a729d83e943444e1543f1476f2b96e8ecbe251112cf82fb23edb97ea837cc00508bdbe0658213987b3494859a9cf028a853e221e0e7916a7924899"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-media-videoanalyzer-edge) \
python311-azure-media-videoanalyzer-edge \
python3dist(azure-media-videoanalyzer-edge)"

RDEPENDS:${PN} += "python(abi) \
python311-azure-core \
python311-azure-media-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
