SUMMARY = "Python SDKs for the Slack API"
DESCRIPTION = "The Slack platform offers several APIs to build apps. Each Slack API delivers \
part of the capabilities from the platform, so that you can pick just those \
that fit for your needs. This SDK offers a corresponding package for each of \
Slack’s APIs. They are small and powerful when used independently, and work \
seamlessly when used together, too."
LICENSE = "MIT"

PV = "3.21.3"

RPM_NAME = "python39-slack-sdk-3.21.3-1.2.noarch.rpm"
RPM_HASH = "275d295f910051f24fb433391f6630bb7dcdfdf7c7d9c792a0c48bc98900284b14496e19638cfd7be849cb8a9516544ff06bd996bf7bebf8152751b749f3b0ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-slack-sdk \
python39-slack-sdk \
python39-slackclient \
python3dist-slack-sdk"

RDEPENDS:${PN} += "python-abi"

inherit rpm
