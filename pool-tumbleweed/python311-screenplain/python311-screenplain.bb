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

RPM_NAME = "python311-screenplain-0.9.0+git.1679319196.353e6c9-2.1.noarch.rpm"
RPM_HASH = "8e9918be4d0bd6ca6514d318e79bcdca74ee13fce2c59f5df3047b79b7c1a78cadc13d7e9013c2936614ac85e70f4c305a23e8187c676ecc46c0f09dd65e51bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-screenplain \
python3.11dist-screenplain \
python311-screenplain \
python3dist-screenplain"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-reportlab \
update-alternatives"

inherit rpm
