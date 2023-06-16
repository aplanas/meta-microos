SUMMARY = "The Cyclop typeface"
DESCRIPTION = "The Cyclop typeface was designed in the 1920s at the workshop \
of Warsaw type foundry 'Odlewnia Czcionek J. Idzkowski i S-ka'. \
This sans serif typeface has a highly modulated stroke so it \
has high typographic contrast. The vertical stems are much \
heavier then horizontal ones. Most characters have thin \
rectangles as additional counters giving the unique shape of \
the characters. The lead types of Cyclop typeface were produced \
in slanted variant at sizes 8-48 pt. It was heavily used for \
heads in newspapers and accidents prints. Typesetters used \
Cyclop in the inter-war period, during the occupation in the \
underground press. The typeface was used until the beginnings \
of the offset print and computer typesetting era. Nowadays it \
is hard to find the metal types of this typeface. The font was \
generated using the Metatype1 package. Then the original set of \
characters was completed by adding the full set of accented \
letters and characters of the modern Latin alphabets (including \
Vietnamese). The upright variant was generated and it was more \
complicated task than it appeared at the beginning. 11 upright \
letters of the Cyclop typeface were presented in the book by \
Filip Trzaska, 'Podstawy techniki wydawniczej' ('Foundation of \
the publishing techonology'), Warsaw 1967. But even the author \
of the book does not know what was the source of the presented \
examples. The fonts are distributed in the Type1 and OpenType \
formats along with the files necessary for use these fonts in \
TeX and LaTeX including encoding definition files: T1 (ec), T5 \
(Vietnamese), OT4, QX, texnansi and nonstandard ones (IL2 for \
Czech fonts)."
LICENSE = "LPPL-1.3c"

PV = "2023.204.0.0.915svn18651"

RPM_NAME = "texlive-cyklop-2023.204.0.0.915svn18651-54.1.noarch.rpm"
RPM_HASH = "4c660db743992d165c4d23f71916fb7010a7670f6689c2106f13c386836c6ea08a6ece97425a812b688df5b99c108d25d9fadcf4af8be253880cf26e277c0232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cs-cyklop-sc.enc \
tex-cs-cyklop.enc \
tex-cs-cyklopi-sc.tfm \
tex-cs-cyklopi.tfm \
tex-cs-cyklopr-sc.tfm \
tex-cs-cyklopr.tfm \
tex-cyklop-cs.map \
tex-cyklop-ec.map \
tex-cyklop-l7x.map \
tex-cyklop-ly1.map \
tex-cyklop-qx.map \
tex-cyklop-t5.map \
tex-cyklop.map \
tex-cyklop.sty \
tex-ec-cyklop-sc.enc \
tex-ec-cyklop.enc \
tex-ec-cyklopi-sc.tfm \
tex-ec-cyklopi.tfm \
tex-ec-cyklopr-sc.tfm \
tex-ec-cyklopr.tfm \
tex-il2cyklop.fd \
tex-l7x-cyklop-sc.enc \
tex-l7x-cyklop.enc \
tex-l7x-cyklopi-sc.tfm \
tex-l7x-cyklopi.tfm \
tex-l7x-cyklopr-sc.tfm \
tex-l7x-cyklopr.tfm \
tex-l7xcyklop.fd \
tex-ly1-cyklop-sc.enc \
tex-ly1-cyklop.enc \
tex-ly1-cyklopi-sc.tfm \
tex-ly1-cyklopi.tfm \
tex-ly1-cyklopr-sc.tfm \
tex-ly1-cyklopr.tfm \
tex-ly1cyklop.fd \
tex-ot1cyklop.fd \
tex-ot4cyklop.fd \
tex-qx-cyklop-sc.enc \
tex-qx-cyklop.enc \
tex-qx-cyklopi-sc.tfm \
tex-qx-cyklopi.tfm \
tex-qx-cyklopr-sc.tfm \
tex-qx-cyklopr.tfm \
tex-qxcyklop.fd \
tex-t1cyklop.fd \
tex-t5-cyklop-sc.enc \
tex-t5-cyklop.enc \
tex-t5-cyklopi-sc.tfm \
tex-t5-cyklopi.tfm \
tex-t5-cyklopr-sc.tfm \
tex-t5-cyklopr.tfm \
tex-t5cyklop.fd \
texlive-cyklop"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-cyklop-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
