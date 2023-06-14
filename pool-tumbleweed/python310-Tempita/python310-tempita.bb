SUMMARY = "A very small text templating language"
DESCRIPTION = "Tempita is a small templating language for text substitution. \
 \
This isn't meant to be the Next Big Thing in templating; it's just a \
handy little templating language for when your project outgrows \
string.Template or % substitution.  It's small, it embeds \
Python in strings, and it doesn't do much else."
LICENSE = "MIT"

PV = "0.5.2+git.1630978236.a30af77"

RPM_NAME = "python310-Tempita-0.5.2+git.1630978236.a30af77-1.12.noarch.rpm"
RPM_HASH = "77d0330b29122e6df70b298bd1853bc61a52acd02ed1baf8baec837db4d35a1f76412e5ff025dde3b9a1117333873451b412ae1ad4717dd9eca9e3b6d3881fab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Tempita \
python3.10dist-tempita \
python310-Tempita \
python3dist-tempita"

RDEPENDS:${PN} += "python-abi"

inherit rpm
