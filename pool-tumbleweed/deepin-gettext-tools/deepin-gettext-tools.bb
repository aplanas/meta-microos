SUMMARY = "Deepin wrapper for gettext"
DESCRIPTION = "The tools of gettext function wrapper. \
 \
Currently supported languages: Python, QML, Go lang"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "deepin-gettext-tools-1.0.10-1.2.noarch.rpm"
RPM_HASH = "5da3032a951711e0629ac263a6a5eb2bfb4ef83dab1ac84aa7b1e7e4a824d49d5e75a8efea24cee7243e48268cf8f2ea403bb77f36d165602e074addd470a44c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-gettext-tools"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
gettext \
perl(Config::Tiny) \
perl(Exporter::Tiny) \
perl(XML::LibXML) \
perl(XML::LibXML::PrettyPrint) \
python3"

inherit rpm
