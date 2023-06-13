SUMMARY = "Python SDKs for the Slack API"
DESCRIPTION = "The Slack platform offers several APIs to build apps. Each Slack API delivers \
part of the capabilities from the platform, so that you can pick just those \
that fit for your needs. This SDK offers a corresponding package for each of \
Slack’s APIs. They are small and powerful when used independently, and work \
seamlessly when used together, too."
LICENSE = "MIT"

PV = "3.21.3"

RPM_NAME = "python39-slack-sdk-3.21.3-1.1.noarch.rpm"
RPM_HASH = "5f665325af5d4dd8a4eecc4b6b2e36dd199178928bd1497b14dd482c95aff17da1050882ca7873caaa481babc12bf2a51d71ea5a452f10a24da49db64553bcf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(slack-sdk) \
python39-slack-sdk \
python39-slackclient \
python3dist(slack-sdk)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
