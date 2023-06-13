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

RPM_NAME = "perl-YAML-Syck-1.34-1.16.aarch64.rpm"
RPM_HASH = "f3492f175184b3561692cc0fa2397468eff7259fab090ce13b286a05be5c41386e29ad77a695a39c99e828873ebaf9b85f9434f71ab7153c8134cdeb612765fc"

RPROVIDES:${PN} += "perl(JSON::Syck) \
perl(YAML::Dumper::Syck) \
perl(YAML::Loader::Syck) \
perl(YAML::Syck) \
perl-YAML-Syck \
perl-YAML-Syck(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
