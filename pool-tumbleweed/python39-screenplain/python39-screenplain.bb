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

RPM_NAME = "python39-screenplain-0.9.0+git.1679319196.353e6c9-2.1.noarch.rpm"
RPM_HASH = "825a2f66fd1993efe64e43f9eb32f85caa09f9493811d8ddca7b9579fb862f51f3280d7090303829cb843e22cb1581deb8c4f2c25ab2ab364db0aa3e3341e562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-screenplain \
python39-screenplain \
python3dist-screenplain"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-reportlab \
update-alternatives"

inherit rpm
