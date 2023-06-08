SUMMARY = "Haskell brick library development files"
DESCRIPTION = "This package provides the Haskell brick library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6"

RPM_NAME = "ghc-brick-devel-1.6-2.4.aarch64.rpm"
RPM_HASH = "4fdc70286cfda7c98d6faef7a50aa01ecd722cd3404778b41bfbc7082332e5e64dee8e050a8c41199cce93967be1a18be21e3fb88ad0a21b34e556a1fcbe4eaf"

RPROVIDES:${PN} += "ghc-brick-devel ghc-brick-devel(aarch-64) ghc-devel(brick-1.6-LMplG6IsGlb3C6L6NTrgWE)"
RDEPENDS:${PN} += "/bin/sh ghc-brick ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(bimap-0.5.0-3nKyJuRybYg2I5XOsBhwKE) ghc-devel(bytestring-0.11.4.0) ghc-devel(config-ini-0.2.5.0-RR92dYVdpi9XWpA99EDX9) ghc-devel(containers-0.6.7) ghc-devel(contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao) ghc-devel(data-clist-0.2-LT5UCpKeur34zcxFsnpoqW) ghc-devel(deepseq-1.4.8.0) ghc-devel(directory-1.3.7.1) ghc-devel(exceptions-0.10.5) ghc-devel(filepath-1.4.2.2) ghc-devel(microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1) ghc-devel(microlens-mtl-0.2.0.3-50s7aKrmu33tjGZvdN4FV) ghc-devel(microlens-th-0.4.3.12-A1OnPrF7gbKLp2skY17lAG) ghc-devel(mtl-2.2.2) ghc-devel(stm-2.5.1.0) ghc-devel(template-haskell-2.19.0.0) ghc-devel(text-2.0.2) ghc-devel(text-zipper-0.12-HAxIdT2NfEj1pbIOe2MIin) ghc-devel(unix-2.7.3) ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) ghc-devel(vty-5.38-E9MiSc6Hkm5LKREDrOQCil) ghc-devel(word-wrap-0.5-8lP0dTi9CAzDFiJFYJ3rcZ)"

inherit rpm
