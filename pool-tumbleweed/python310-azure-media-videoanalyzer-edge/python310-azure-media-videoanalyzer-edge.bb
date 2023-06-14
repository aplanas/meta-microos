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

RPM_NAME = "python310-azure-media-videoanalyzer-edge-1.0.0b4-1.5.noarch.rpm"
RPM_HASH = "d766ab04ad66f0235f16de59bec209f221042a50dd438f63f4779d033f91c72f6f4aa55b0fe518eb85324f8b42567e58a8f7369bf7702a7548eda704138ea536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-media-videoanalyzer-edge \
python3.10dist-azure-media-videoanalyzer-edge \
python310-azure-media-videoanalyzer-edge \
python3dist-azure-media-videoanalyzer-edge"

RDEPENDS:${PN} += "python-abi \
python310-azure-core \
python310-azure-media-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
