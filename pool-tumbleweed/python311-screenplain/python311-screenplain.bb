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

RPM_NAME = "python311-screenplain-0.9.0+git.1679319196.353e6c9-1.2.noarch.rpm"
RPM_HASH = "a6e55da4518e5c62cfb178f095b159af8cc0d666eac254f0654b301d5f8551cebec3a2464f7aed36efc729b690a04dbd7ffc3f47a40c3434626738a99951c892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-screenplain \
python311-screenplain \
python3dist-screenplain"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-reportlab \
update-alternatives"

inherit rpm
