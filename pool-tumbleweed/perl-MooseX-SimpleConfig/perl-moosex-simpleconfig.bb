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

RPM_NAME = "perl-MooseX-SimpleConfig-0.11-1.25.noarch.rpm"
RPM_HASH = "8e883b4f8d4e25e0433ab72ca62ab11342c00c6684a3a40a3e0535dc1647e20484ed68c5fc46a82903ae0442c570670a8a49ba24ef4a24d15b61bce1d4d431b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--SimpleConfig \
perl-MooseX-SimpleConfig"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Config--Any \
perl-Moose--Role \
perl-MooseX--ConfigFromFile"

inherit rpm
