SUMMARY = "A very small text templating language"
DESCRIPTION = "Tempita is a small templating language for text substitution. \
 \
This isn't meant to be the Next Big Thing in templating; it's just a \
handy little templating language for when your project outgrows \
string.Template or % substitution.  It's small, it embeds \
Python in strings, and it doesn't do much else."
LICENSE = "MIT"

PV = "0.5.2+git.1630978236.a30af77"

RPM_NAME = "python311-Tempita-0.5.2+git.1630978236.a30af77-1.14.noarch.rpm"
RPM_HASH = "f4fce2f6485c7f1644a35908c9031b0eb046ae82d7f60ff8ef0f601c70b415ec6e07d19d9ceedc1a63b457d501238f129bc505d5236cb74dfa9d7c0fbaf0195e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Tempita \
python3.11dist-tempita \
python311-Tempita \
python3dist-tempita"

RDEPENDS:${PN} += "python-abi"

inherit rpm
