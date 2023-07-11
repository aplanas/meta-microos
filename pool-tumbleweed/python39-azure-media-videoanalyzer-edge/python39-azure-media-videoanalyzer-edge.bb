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

RPM_NAME = "python39-azure-media-videoanalyzer-edge-1.0.0b4-1.7.noarch.rpm"
RPM_HASH = "b00c50ba2030f7913235b5aeac84c909e6cda04fe81d00730886a769e59c38b2766bdfc67c8bb4baadb67189ca12ce756757f33bd16e65c38cdac55a6d8d523e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-media-videoanalyzer-edge \
python39-azure-media-videoanalyzer-edge \
python3dist-azure-media-videoanalyzer-edge"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-media-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
