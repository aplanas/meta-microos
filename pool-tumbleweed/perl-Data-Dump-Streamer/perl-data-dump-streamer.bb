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

RPM_NAME = "perl-Data-Dump-Streamer-2.42-1.2.aarch64.rpm"
RPM_HASH = "168e2eecad272aa53bb5d7bae38257d5ef0e83b70cbc757ec1304844f5c74b995376b539eeaa55f4832314939ad340a5a6207b00314418fea68a9a499cca2471"

RPROVIDES:${PN} += "perl(Data::Dump::Streamer) \
perl(Data::Dump::Streamer::Deparser) \
perl-Data-Dump-Streamer \
perl-Data-Dump-Streamer(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(B::Utils)"

inherit rpm
