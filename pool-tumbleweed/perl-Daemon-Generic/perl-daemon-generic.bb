SUMMARY = "Framework to Provide Start/Stop/Reload for a Daemon"
DESCRIPTION = "Daemon::Generic provides a framework for starting, stopping, reconfiguring \
daemon-like programs. The framework provides for standard commands that \
work for as init.d files and as apachectl-like commands. \
 \
Programs that use Daemon::Generic subclass Daemon::Generic to override its \
behavior. Almost everything that Genric::Daemon does can be overridden as \
needed."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.85"

RPM_NAME = "perl-Daemon-Generic-0.85-1.22.noarch.rpm"
RPM_HASH = "5257068e017eb3da816ceb2c03177fb2dc649a87040ef3e6da23ac3f7d408865914e42d8791a79b0c06ef2df18153921505265e0997d2aad6434112bc49f7138"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Daemon--Generic \
perl-Daemon--Generic--AnyEvent \
perl-Daemon--Generic--Event \
perl-Daemon--Generic--While1 \
perl-Daemon-Generic"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--Flock \
perl-File--Slurp"

inherit rpm
