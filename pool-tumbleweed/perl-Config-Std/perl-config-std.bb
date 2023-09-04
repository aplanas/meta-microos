SUMMARY = "Load and save configuration files in a standard format"
DESCRIPTION = "This module implements yet another damn configuration-file system. \
 \
The configuration language is deliberately simple and limited, and the \
module works hard to preserve as much information (section order, comments, \
etc.) as possible when a configuration file is updated. \
 \
The whole point of Config::Std is to encourage use of one standard layout \
and syntax in config files. Damian says 'I could have gotten away with it, \
I would have only allowed one separator. But it proved impossible to choose \
between ':' and '=' (half the people I asked wanted one, half wanted the \
other).' Providing round-trip file re-write is the spoonful of sugar to \
help the medicine go down. The supported syntax is within the general INI \
file family \
 \
See Chapter 19 of 'Perl Best Practices' (O'Reilly, 2005) for more detail on \
the rationale for this approach."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.903"

RPM_NAME = "perl-Config-Std-0.903-1.21.noarch.rpm"
RPM_HASH = "dddfedaeb2f0dc2049de9ad64d9d7344b39bde045dce59cceb8c58ca8750cdcf08a4a77dd4f2a989a82ddc72ae114ac7b83979c02a4f5125efbe3b2bbec7e57c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--Std \
perl-Config--Std--Block \
perl-Config--Std--Comment \
perl-Config--Std--Gap \
perl-Config--Std--Hash \
perl-Config--Std--Keyval \
perl-Config-Std"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Std \
perl-version"

inherit rpm
