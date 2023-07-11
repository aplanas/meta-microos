SUMMARY = "Perl YAML loader and dumper"
DESCRIPTION = "This module provides a Perl interface to the *libsyck* data serialization \
library. It exports the 'Dump' and 'Load' functions for converting Perl \
data structures to YAML strings, and the other way around. \
 \
*NOTE*: If you are working with other language's YAML/Syck bindings (such \
as Ruby), please set '$YAML::Syck::ImplicitTyping' to '1' before calling \
the 'Load'/'Dump' functions. The default setting is for preserving \
backward-compatibility with 'YAML.pm'."
LICENSE = "MIT"

PV = "1.34"

RPM_NAME = "perl-YAML-Syck-1.34-1.17.aarch64.rpm"
RPM_HASH = "bd895f4f21894baac9b667b67df14988db1087acdc98923521f032077ee71b8d99deb1ff39039925dfd33e24a7ae7055a90378e2dcde2681070b1dff9954c0fc"

RPROVIDES:${PN} += "perl-JSON--Syck \
perl-YAML--Dumper--Syck \
perl-YAML--Loader--Syck \
perl-YAML--Syck \
perl-YAML-Syck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
