SUMMARY = "Portably create pipe() or pipe-like handles, one way or another"
DESCRIPTION = "Pipes are troublesome beasts because there are a few different, \
incompatible ways to create them. Not all platforms support all ways, and \
some platforms may have hidden difficulties like incomplete or buggy \
support. \
 \
IO::Pipely provides a couple functions to portably create one- and two-way \
pipes and pipe-like socket pairs. It acknowledges and works around known \
platform issues so you don't have to. \
 \
On the other hand, it doesn't work around unknown issues, so please report \
any problems early and often. \
 \
IO::Pipely currently understands pipe(), UNIX-domain socketpair() and \
regular IPv4 localhost sockets. This covers every platform tested so far, \
but it's hardly complete. Please help support other mechanisms, such as \
INET-domain socketpair() and IPv6 localhost sockets. \
 \
IO::Pipely will use different kinds of pipes or sockets depending on the \
operating system's capabilities and the number of directions requested. The \
autodetection may be overridden by specifying a particular pipe type."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.006"

RPM_NAME = "perl-IO-Pipely-0.006-1.9.noarch.rpm"
RPM_HASH = "8e1f108f110f4257eca9bcb4d5b3d778c4010cddf65ddcc21d1cfb1c28e6ff6a20984aee7c106b17dc4fc7f8c6bcad66a29adc534c870702ef312ab168214f64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--Pipely \
perl-IO-Pipely"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Exporter \
perl-Fcntl \
perl-IO--Socket \
perl-Symbol"

inherit rpm
