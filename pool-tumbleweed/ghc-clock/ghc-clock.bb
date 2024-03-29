SUMMARY = "High-resolution clock functions: monotonic, realtime, cputime"
DESCRIPTION = "A package for convenient access to high-resolution clock and timer functions of \
different operating systems via a unified API. \
 \
POSIX code and surface API was developed by Cetin Sert in 2009. \
 \
Windows code was contributed by Eugene Kirpichov in 2010. \
 \
FreeBSD code was contributed by Finn Espen Gundersen on 2013-10-14. \
 \
OS X code was contributed by Gerolf Seitz on 2013-10-15. \
 \
Derived 'Generic', 'Typeable' and other instances for 'Clock' and 'TimeSpec' \
was contributed by Mathieu Boespflug on 2014-09-17. \
 \
Corrected dependency listing for 'GHC < 7.6' was contributed by Brian McKenna \
on 2014-09-30. \
 \
Windows code corrected by Dimitri Sabadie on 2015-02-09. \
 \
Added 'timeSpecAsNanoSecs' as observed widely-used by Chris Done on 2015-01-06, \
exported correctly on 2015-04-20. \
 \
Imported Control.Applicative operators correctly for Haskell Platform on \
Windows on 2015-04-21. \
 \
Unit tests and instance fixes by Christian Burger on 2015-06-25. \
 \
Removal of fromInteger : Integer -> TimeSpec by Cetin Sert on 2015-12-15. \
 \
New Linux-specific Clocks: MonotonicRaw, Boottime, MonotonicCoarse, \
RealtimeCoarse by Cetin Sert on 2015-12-15. \
 \
Reintroduction fromInteger : Integer -> TimeSpec by Cetin Sert on 2016-04-05. \
 \
Fixes for older Linux build failures introduced by new Linux-specific clocks by \
Mario Longobardi on 2016-04-18. \
 \
Refreshment release in 2019-04 after numerous contributions. \
 \
Refactoring for Windows, Mac implementation consistence by Alexander Vershilov \
on 2021-01-16. \
 \
[Version Scheme] Major-'/R/'-ewrite . New-'/F/'-unctionality . \
'/I/'-mprovementAndBugFixes . '/P/'-ackagingOnly \
 \
* 'PackagingOnly' changes are made for quality assurance reasons."
LICENSE = "BSD-3-Clause"

PV = "0.8.4"

RPM_NAME = "ghc-clock-0.8.4-1.2.aarch64.rpm"
RPM_HASH = "c1019765dbd5ec7d2f27fb1c9453ed34a7d2af86f96f29ecf59a671ee82581e45ce654cd1cd57c19298e323f57ed8373d4783418c21dd56f08b1b6d2a340e3dc"

RPROVIDES:${PN} += "ghc-clock \
libHSclock-0.8.4-FaEd7XcSjZTFKcoXlUaX3W-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
