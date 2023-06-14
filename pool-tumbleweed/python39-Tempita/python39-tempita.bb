SUMMARY = "A very small text templating language"
DESCRIPTION = "Tempita is a small templating language for text substitution. \
 \
This isn't meant to be the Next Big Thing in templating; it's just a \
handy little templating language for when your project outgrows \
string.Template or % substitution.  It's small, it embeds \
Python in strings, and it doesn't do much else."
LICENSE = "MIT"

PV = "0.5.2+git.1630978236.a30af77"

RPM_NAME = "python39-Tempita-0.5.2+git.1630978236.a30af77-1.12.noarch.rpm"
RPM_HASH = "b06017d0ba95aa02f831d3fc8ed13e95ce02b21a87dbb26235ce9fd404d6993a24accd5ec5af6ac55cec6b9a8e6bc57f52d389cf4a3e9bf3f4b77a64d05b0639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tempita \
python39-Tempita \
python3dist-tempita"

RDEPENDS:${PN} += "python-abi"

inherit rpm
