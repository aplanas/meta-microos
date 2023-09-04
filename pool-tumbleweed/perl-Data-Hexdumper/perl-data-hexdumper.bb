SUMMARY = "Make binary data human-readable"
DESCRIPTION = "'Data::Hexdumper' provides a simple way to format arbitrary binary data \
into a nice human-readable format, somewhat similar to the Unix 'hexdump' \
utility. \
 \
It gives the programmer a considerable degree of flexibility in how the \
data is formatted, with sensible defaults. It is envisaged that it will \
primarily be of use for those wrestling alligators in the swamp of binary \
file formats, which is why it was written in the first place."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.0001"

RPM_NAME = "perl-Data-Hexdumper-3.0001-1.4.noarch.rpm"
RPM_HASH = "07f2cc51474d1fe1a25c214f1e4fe64bea75c29f241d29a8e13ba953d5cb0d642f741e69d42c3aae06e830164416102ae91c399b3a0d1d860477bb774bb04a33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Hexdumper \
perl-Data-Hexdumper"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test--More"

inherit rpm
