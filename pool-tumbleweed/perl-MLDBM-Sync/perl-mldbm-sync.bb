SUMMARY = "Perl module for safe concurrent access to MLDBM databases"
DESCRIPTION = "This module wraps around the MLDBM interface, by handling concurrent \
access to MLDBM databases with file locking, and flushes i/o explicity \
per lock/unlock. The new [Read]Lock()/UnLock() API can be used to \
serialize requests logically and improve performance for bundled reads \
& writes."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.30"

RPM_NAME = "perl-MLDBM-Sync-0.30-408.42.aarch64.rpm"
RPM_HASH = "df785c822408e53fd8a53c3796e70b3fd60350a93b0ed969464a075e6f38ccb8f3476ce11db0674a55a5e002a3b6dcce6007a12499c4e3d128a948fe787e3055"

RPROVIDES:${PN} += "perl-MLDBM--Sync \
perl-MLDBM--Sync--SDBM-File \
perl-MLDBM-Sync"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-MLDBM \
perl-Tie-Cache"

inherit rpm
