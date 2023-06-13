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

RPM_NAME = "python310-screenplain-0.9.0+git.1679319196.353e6c9-1.2.noarch.rpm"
RPM_HASH = "88683083ce26f31757c28eecee641b726df1915179489934f346def41c824ac979a2e978ea38d9cbe6a042ac22f82784c14c6f0827f117e42ab48e59bd5d5b9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-screenplain \
python3.10dist(screenplain) \
python310-screenplain \
python3dist(screenplain)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-reportlab \
update-alternatives"

inherit rpm
