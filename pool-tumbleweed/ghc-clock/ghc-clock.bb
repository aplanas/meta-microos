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

RPM_NAME = "ghc-clock-0.8.4-1.1.aarch64.rpm"
RPM_HASH = "e622525fca407b08090d00025a1e71d4e232c9538030a826fdb1ea8156b04996e92379eab4c27751da649b6cdd9d37d23786dd74d4e3c5ea8979d2ed2c8760c6"

RPROVIDES:${PN} += "ghc-clock \
libHSclock-0.8.4-Kk7SFw4SNhZ8ktwfjRIPil-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
