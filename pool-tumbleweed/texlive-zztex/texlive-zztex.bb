SUMMARY = "A full-featured TeX macro package for producing books, journals, and manuals"
DESCRIPTION = "The ZzTeX macro package is a full-featured TeX macro package \
specially designed for producing books, journals, and manuals. \
Development of the package began in 1989. Since then, about 500 \
textbooks and journals have been produced with it for a variety \
of publishers. Numerous authors have used the package to \
produce subsequent editions of their books. ZzTeX runs under \
Plain TeX. The only documentation available for the package is \
contained in the zz*.dat files that accompany the TeX files."
LICENSE = "LPPL-1.0"

PV = "2023.201.17.7svn55862"

RPM_NAME = "texlive-zztex-2023.201.17.7svn55862-52.1.noarch.rpm"
RPM_HASH = "99692d1c4d1d776483e4aada2740a91536b21fa48ff48a377bf5997639f27a56e84dc0adfc606b1cc10aa315080abc11fc5c44c54a974e9f395f445190d4bca6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(zzart.tex) \
tex(zzbiblio.tex) \
tex(zzbibtex.tex) \
tex(zzblock.tex) \
tex(zzcmmath.tex) \
tex(zzcomenc.tex) \
tex(zzdiv.tex) \
tex(zzdoc.tex) \
tex(zzerror.tex) \
tex(zzfloat.tex) \
tex(zzfont.tex) \
tex(zzfront.tex) \
tex(zzhelp.tex) \
tex(zzhmode.tex) \
tex(zzhmodeb.tex) \
tex(zzhyper.tex) \
tex(zzhyph.tex) \
tex(zzindexv1.tex) \
tex(zzindexv2.tex) \
tex(zzio.tex) \
tex(zzlist.tex) \
tex(zzltrspc.tex) \
tex(zzlucida.tex) \
tex(zzmath.tex) \
tex(zzmathv3.tex) \
tex(zzmathv4.tex) \
tex(zzmathv5.tex) \
tex(zzmathv6.tex) \
tex(zzmerge.tex) \
tex(zzmisc.tex) \
tex(zzmtime.tex) \
tex(zznewmath.tex) \
tex(zznote.tex) \
tex(zzoverlay.tex) \
tex(zzpage.tex) \
tex(zzplain.tex) \
tex(zzprog.tex) \
tex(zzps.tex) \
tex(zzreg.tex) \
tex(zzrunner.tex) \
tex(zzsect.tex) \
tex(zztabbing.tex) \
tex(zztabularv1.tex) \
tex(zztabularv2.tex) \
tex(zztabularv3.tex) \
tex(zztag.tex) \
tex(zztex.tex) \
tex(zztext.tex) \
tex(zzttladj.tex) \
tex(zztures.tex) \
tex(zzver.tex) \
tex(zzvmode.tex) \
tex(zzxref.tex) \
texlive-zztex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
