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

RPM_NAME = "perl-YAML-Syck-1.34-1.18.aarch64.rpm"
RPM_HASH = "e12a43f2874a338237215a1377db71297fcca63aa8529a3a01e6e0e530b3feb31eda283ff99872293d9bdf8f655bc0574b6c223ed14187512ea42e95b42d7929"

RPROVIDES:${PN} += "perl-JSON--Syck \
perl-YAML--Dumper--Syck \
perl-YAML--Loader--Syck \
perl-YAML--Syck \
perl-YAML-Syck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
