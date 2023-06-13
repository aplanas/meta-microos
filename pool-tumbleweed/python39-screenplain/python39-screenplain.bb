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

RPM_NAME = "python39-screenplain-0.9.0+git.1679319196.353e6c9-1.2.noarch.rpm"
RPM_HASH = "f7cd21d60c654be9164063e9658e86b4ecfc7614f9eb410208f5466fa4b1fe5aac53049fb8b5add61adf881d0529646cd39432e2239fc23bc6bc8030b664627e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(screenplain) \
python39-screenplain \
python3dist(screenplain)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-reportlab \
update-alternatives"

inherit rpm
