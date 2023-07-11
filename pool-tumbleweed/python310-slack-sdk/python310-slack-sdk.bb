SUMMARY = "Python SDKs for the Slack API"
DESCRIPTION = "The Slack platform offers several APIs to build apps. Each Slack API delivers \
part of the capabilities from the platform, so that you can pick just those \
that fit for your needs. This SDK offers a corresponding package for each of \
Slack’s APIs. They are small and powerful when used independently, and work \
seamlessly when used together, too."
LICENSE = "MIT"

PV = "3.21.3"

RPM_NAME = "python310-slack-sdk-3.21.3-1.2.noarch.rpm"
RPM_HASH = "df8624086d2d7fad68b67b87578d43080f1145241ab1963bf606d81426b4e42852c56f3f85173985588a3f4773080f0783b6edc64b9f55f9c825295d4fdd391f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-slack-sdk \
python310-slack-sdk \
python310-slackclient \
python3dist-slack-sdk"

RDEPENDS:${PN} += "python-abi"

inherit rpm
