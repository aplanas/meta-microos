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

RPM_NAME = "python310-screenplain-0.9.0+git.1679319196.353e6c9-2.1.noarch.rpm"
RPM_HASH = "ce2c2fd2d56900efc7c9b4658e6611f9c704ca94b8f8638b894dd28a19ff425afa9bcf8952a7d4287b79e089163d89e7906d4e339d809e00713733aa26f359cb"
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
