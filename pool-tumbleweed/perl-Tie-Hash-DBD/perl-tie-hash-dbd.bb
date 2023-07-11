SUMMARY = "Tie plain hashes to DBI interface"
DESCRIPTION = "This module has been created to act as a drop-in replacement for modules \
that tie straight perl hashes to disk, like 'DB_File'. When the running \
system does not have enough memory to hold large hashes, and disk-tieing \
won't work because there is not enough space, it works quite well to tie \
the hash to a database, which preferable runs on a different server. \
 \
This module ties a hash to a database table using *only* a 'key' and a \
'value' field. If no tables specification is passed, this will create a \
temporary table with 'h_key' for the key field and a 'h_value' for the \
value field. \
 \
I think it would make sense to merge the functionality that this module \
provides into 'Tie::DBI'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.24"

RPM_NAME = "perl-Tie-Hash-DBD-0.24-1.2.noarch.rpm"
RPM_HASH = "255d712a7dbed663f9cf4f723b7ba6dd14bfc22206bc2001cc33c41d68d9225b0bc1d43d4be361a022d758213479289f155e9309d65ab62a38a2b6442d0a3cbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--Array--DBD \
perl-Tie--Hash--DBD \
perl-Tie-Hash-DBD"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DBI \
perl-Test--More"

inherit rpm
