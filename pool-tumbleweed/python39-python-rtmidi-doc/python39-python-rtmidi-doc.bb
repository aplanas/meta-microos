SUMMARY = "HTML documentation and examples for python-rtmidi"
DESCRIPTION = "Contains HTML documentation and examples for python-rtmidi."
LICENSE = "MIT"

PV = "1.4.9"

RPM_NAME = "python39-python-rtmidi-doc-1.4.9-3.1.noarch.rpm"
RPM_HASH = "79fc7024b2083a209260b774dd1f6944819c26b37df66303ba1108d30159c86cf51e06931a140cbc70a812bbdef1fa649e654e9a41f0aa9577bc1fd9bfcfa389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-python-rtmidi-doc"

RDEPENDS:${PN} += ""

inherit rpm
