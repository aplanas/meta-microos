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

RPM_NAME = "perl-Daemon-Generic-0.85-1.21.noarch.rpm"
RPM_HASH = "4e91e845b6d3c51ac54d05460d7558e732c61b8c9c25b2efe58ed57eafc4e1f70ea33c31e09595056a743c71c49b4c76876ea0b40a1b9dc76db5187d14e7a4fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Daemon--Generic \
perl-Daemon--Generic--AnyEvent \
perl-Daemon--Generic--Event \
perl-Daemon--Generic--While1 \
perl-Daemon-Generic"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--Flock \
perl-File--Slurp"

inherit rpm
