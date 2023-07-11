SUMMARY = "Convert text file to viewable screenplay"
DESCRIPTION = "Screenplain allows you to write a screenplay as a plain text \
file using a format called Fountain. Text files are simple \
and supported by all text manipulation software. It's not \
just for hackers, too. The simplicity of plain text allows \
you to easily view and edit them on devices such as tablets \
and phones. No need for specific screenwriting software. \
 \
The magic that Screenplain performs is to take your plain \
text file and convert it to a good looking screenplay in an \
industry standard format. Send that file off to your producer, \
agent, director or screenwriting competition. Currently, the \
supported output formats are FDX and HTML. PDF will hopefully \
be supported in a not too distant future."
LICENSE = "MIT"

PV = "0.9.0+git.1679319196.353e6c9"

RPM_NAME = "python310-screenplain-0.9.0+git.1679319196.353e6c9-1.4.noarch.rpm"
RPM_HASH = "7520ce59c03b789c762a74f6b4f9bf22b41ee45d716da7bb6cb05893cb910f599a003ffa3b98a65d6144e72dde5c09b4df22bd78b13ab1f0d82e01740c0a426f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-screenplain \
python310-screenplain \
python3dist-screenplain"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-reportlab \
update-alternatives"

inherit rpm
