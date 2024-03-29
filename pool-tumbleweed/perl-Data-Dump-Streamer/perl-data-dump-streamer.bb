SUMMARY = "Accurately serialize a data structure as Perl code"
DESCRIPTION = "Given a list of scalars or reference variables, writes out their contents \
in perl syntax. The references can also be objects. The contents of each \
variable is output using the least number of Perl statements as convenient, \
usually only one. Self-referential structures, closures, and objects are \
output correctly. \
 \
The return value can be evaled to get back an identical copy of the \
original reference structure. In some cases this may require the use of \
utility subs that Data::Dump::Streamer will optionally export. \
 \
This module is very similar in concept to the core module Data::Dumper, \
with the major differences being that this module is designed to output to \
a stream instead of constructing its output in memory (trading speed for \
memory), and that the traversal over the data structure is effectively \
breadth first versus the depth first traversal done by the others. \
 \
In fact the data structure is scanned twice, first in breadth first mode to \
perform structural analysis, and then in depth first mode to actually \
produce the output, but obeying the depth relationships of the first pass."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.42"

RPM_NAME = "perl-Data-Dump-Streamer-2.42-1.4.aarch64.rpm"
RPM_HASH = "237ff130ac6c14437b3b98af0da3e9dd5feea7a1075b7bf2d07d0e4f19eb14ac1e70359e0b24c67f38bd03b9ff6bf2a7f5bb0c7965532ad8e3c709274f03cfca"

RPROVIDES:${PN} += "perl-Data--Dump--Streamer \
perl-Data--Dump--Streamer--Deparser \
perl-Data-Dump-Streamer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-B--Utils"

inherit rpm
