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

RPM_NAME = "python310-azure-media-videoanalyzer-edge-1.0.0b4-1.7.noarch.rpm"
RPM_HASH = "35ffe583163bd2ccaf0b4a5d325382a00963ad4e1b6569f1fcf8d42c1387f03c3b0d1a9d446b2757735dd6cfc2a8c1c936181d9c28dc039279fee3afaac6f4d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-media-videoanalyzer-edge \
python310-azure-media-videoanalyzer-edge \
python3dist-azure-media-videoanalyzer-edge"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-media-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
