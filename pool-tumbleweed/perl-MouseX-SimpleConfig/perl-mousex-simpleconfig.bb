SUMMARY = "A Mouse role for setting attributes from a simple configfile"
DESCRIPTION = "This role loads simple configfiles to set object attributes. It is based on \
the abstract role MouseX::ConfigFromFile, and uses Config::Any to load your \
configfile. Config::Any will in turn support any of a variety of different \
config formats, detected by the file extension. See Config::Any for more \
details about supported formats. \
 \
Like all MouseX::ConfigFromFile -derived configfile loaders, this module is \
automatically supported by the MouseX::Getopt role as well, which allows \
specifying '-configfile' on the commandline."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-MouseX-SimpleConfig-0.11-3.25.noarch.rpm"
RPM_HASH = "9f5b540d758057940e272a0774873d59a6fd7bf668a157ed9e0b901273aaddb696c500b5c6130d6717399f3342c552068a9f5c6c599f7b64f8373b54f38a8b41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MouseX--SimpleConfig \
perl-MouseX-SimpleConfig"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Config--Any \
perl-Mouse \
perl-Mouse--Role \
perl-MouseX--ConfigFromFile"

inherit rpm
