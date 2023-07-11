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

RPM_NAME = "perl-MouseX-SimpleConfig-0.11-3.24.noarch.rpm"
RPM_HASH = "05d4ce72a14d0cce35ee243b7a86d139764bf58ea80fd2c523d9be4d6c00b5574486c333181e64a5fb849ce4fc6e70bf2e8db47702e1154abe646bda9e22ceb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MouseX--SimpleConfig \
perl-MouseX-SimpleConfig"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Config--Any \
perl-Mouse \
perl-Mouse--Role \
perl-MouseX--ConfigFromFile"

inherit rpm
