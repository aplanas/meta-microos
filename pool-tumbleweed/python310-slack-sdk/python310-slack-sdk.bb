SUMMARY = "Python SDKs for the Slack API"
DESCRIPTION = "The Slack platform offers several APIs to build apps. Each Slack API delivers \
part of the capabilities from the platform, so that you can pick just those \
that fit for your needs. This SDK offers a corresponding package for each of \
Slack’s APIs. They are small and powerful when used independently, and work \
seamlessly when used together, too."
LICENSE = "MIT"

PV = "3.21.3"

RPM_NAME = "python310-slack-sdk-3.21.3-1.1.noarch.rpm"
RPM_HASH = "6ce9cdcaaccd03dfb03abee02aedd8259fb729106d8e09b9a75c41f1c9668616a19d6b749af8242916f3049ea49dba3fb86ff282278911db89e4a50932e64a70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-slack-sdk \
python3-slackclient \
python3.10dist-slack-sdk \
python310-slack-sdk \
python310-slackclient \
python3dist-slack-sdk"

RDEPENDS:${PN} += "python-abi"

inherit rpm
