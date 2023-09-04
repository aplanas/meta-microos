SUMMARY = "A Moose role for setting attributes from a simple configuration file"
DESCRIPTION = "This role loads simple files to set object attributes. It is based on the \
abstract role the MooseX::ConfigFromFile manpage, and uses the Config::Any \
manpage to load your configuration file. the Config::Any manpage will in \
turn support any of a variety of different config formats, detected by the \
file extension. See the Config::Any manpage for more details about \
supported formats. \
 \
To pass additional arguments to the Config::Any manpage you must provide a \
'config_any_args()' method, for example: \
 \
  sub config_any_args { \
    return { \
      driver_args => { General => { '-InterPolateVars' => 1 } } \
    }; \
  } \
 \
Like all the MooseX::ConfigFromFile manpage -derived file loaders, this \
module is automatically supported by the the MooseX::Getopt manpage role as \
well, which allows specifying '-configfile' on the command line."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-MooseX-SimpleConfig-0.11-1.26.noarch.rpm"
RPM_HASH = "4680215f2740f62c200db4dd6dfad9efb32be0e748d1c398f029eb353cf8e43fbf9085ca57d41eabf6b874014363754d26b6fe6265551fa4a66e24dc2e337a36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--SimpleConfig \
perl-MooseX-SimpleConfig"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Config--Any \
perl-Moose--Role \
perl-MooseX--ConfigFromFile"

inherit rpm
