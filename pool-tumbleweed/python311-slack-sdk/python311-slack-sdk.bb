SUMMARY = "Python SDKs for the Slack API"
DESCRIPTION = "The Slack platform offers several APIs to build apps. Each Slack API delivers \
part of the capabilities from the platform, so that you can pick just those \
that fit for your needs. This SDK offers a corresponding package for each of \
Slack’s APIs. They are small and powerful when used independently, and work \
seamlessly when used together, too."
LICENSE = "MIT"

PV = "3.21.3"

RPM_NAME = "python311-slack-sdk-3.21.3-1.2.noarch.rpm"
RPM_HASH = "c444cf12e3a7187e83da980c2a1b7c8c30c4ce64898bb17e47a86ccd7abeb9470e2df381acf706f187acd324153724d0e5fb0cd2b30350a9cf07a13e830fcc4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-slack-sdk \
python3-slackclient \
python3.11dist-slack-sdk \
python311-slack-sdk \
python311-slackclient \
python3dist-slack-sdk"

RDEPENDS:${PN} += "python-abi"

inherit rpm
