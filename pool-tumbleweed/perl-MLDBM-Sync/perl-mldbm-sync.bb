SUMMARY = "Perl module for safe concurrent access to MLDBM databases"
DESCRIPTION = "This module wraps around the MLDBM interface, by handling concurrent \
access to MLDBM databases with file locking, and flushes i/o explicity \
per lock/unlock. The new [Read]Lock()/UnLock() API can be used to \
serialize requests logically and improve performance for bundled reads \
& writes."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.30"

RPM_NAME = "perl-MLDBM-Sync-0.30-408.43.aarch64.rpm"
RPM_HASH = "75d2cf602fc9791c997270d9d610c970c2b26d95b7fbcfc869cddea97cf6d14775be367fec738be841e3e4d3fc39ebbc983909bb16487651ea815e7d235e183b"

RPROVIDES:${PN} += "perl-MLDBM--Sync \
perl-MLDBM--Sync--SDBM-File \
perl-MLDBM-Sync"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-MLDBM \
perl-Tie-Cache"

inherit rpm
