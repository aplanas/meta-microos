SUMMARY = "A very small text templating language"
DESCRIPTION = "Tempita is a small templating language for text substitution. \
 \
This isn't meant to be the Next Big Thing in templating; it's just a \
handy little templating language for when your project outgrows \
string.Template or % substitution.  It's small, it embeds \
Python in strings, and it doesn't do much else."
LICENSE = "MIT"

PV = "0.5.2+git.1630978236.a30af77"

RPM_NAME = "python310-Tempita-0.5.2+git.1630978236.a30af77-1.14.noarch.rpm"
RPM_HASH = "cb1eb6ce4d16e6e1c501428113bdf6518c9345e133f72d9c977b17018b14177a731bfc4d2150ec90329b7078523bc901244f3af20356451ad36ba3b574c19863"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tempita \
python310-Tempita \
python3dist-tempita"

RDEPENDS:${PN} += "python-abi"

inherit rpm
