SUMMARY = "Development pre-release of the LaTeX kernel"
DESCRIPTION = "This package provides a testing release for upcoming LaTeX2e \
kernel changes. Testing by the LaTeX team itself suggests that \
the code is stable and usable, but wider use by knowledgeable \
users is required by adding these changes to the release LaTeX \
kernel. Typically, the code here will be used by a TeX system \
to create dedicated formats, for example pdflatex-dev, which \
can then be used explicitly for testing."
LICENSE = "LPPL-1.0"

PV = "2023.201.20230601_pre_release_2svn66513"

RPM_NAME = "texlive-latex-base-dev-2023.201.20230601_pre_release_2svn66513-55.1.noarch.rpm"
RPM_HASH = "d668976e70e13df8818e670a7c683d1f659d567c15ef99584596372264654b78d36e54b21c21d0c973c6acb493514b665a0b3c13cdcbd42186eb25ec3aa9eb55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texdev-alltt.sty \
texdev-ansinew.def \
texdev-applemac.def \
texdev-article.cls \
texdev-article.sty \
texdev-ascii.def \
texdev-atbegshi-ltx.sty \
texdev-atveryend-ltx.sty \
texdev-bezier.sty \
texdev-bk10.clo \
texdev-bk11.clo \
texdev-bk12.clo \
texdev-book.cls \
texdev-book.sty \
texdev-cp1250.def \
texdev-cp1252.def \
texdev-cp1257.def \
texdev-cp437.def \
texdev-cp437de.def \
texdev-cp850.def \
texdev-cp852.def \
texdev-cp858.def \
texdev-cp865.def \
texdev-decmulti.def \
texdev-doc-2016-02-15.sty \
texdev-doc-2021-06-01.sty \
texdev-doc.sty \
texdev-docstrip.tex \
texdev-exscale.sty \
texdev-fix-cm.sty \
texdev-fixltx2e.sty \
texdev-flafter.sty \
texdev-fleqn.clo \
texdev-fleqn.sty \
texdev-fltrace.sty \
texdev-fontenc.sty \
texdev-fontmath.cfg \
texdev-fonttext.cfg \
texdev-graphpap.sty \
texdev-idx.tex \
texdev-ifthen.sty \
texdev-inputenc.sty \
texdev-lablst.tex \
texdev-latex209.def \
texdev-latexrelease.sty \
texdev-latexsym.sty \
texdev-latin1.def \
texdev-latin10.def \
texdev-latin2.def \
texdev-latin3.def \
texdev-latin4.def \
texdev-latin5.def \
texdev-latin9.def \
texdev-leqno.clo \
texdev-leqno.sty \
texdev-letter.cls \
texdev-letter.sty \
texdev-lppl.tex \
texdev-ltluatex.tex \
texdev-ltnews.cls \
texdev-ltxcheck.tex \
texdev-ltxdoc.cfg \
texdev-ltxdoc.cls \
texdev-ltxguide.cls \
texdev-macce.def \
texdev-makeidx.sty \
texdev-minimal.cls \
texdev-newlfont.sty \
texdev-next.def \
texdev-nfssfont.tex \
texdev-oldlfont.sty \
texdev-omlcmm.fd \
texdev-omlcmr.fd \
texdev-omlenc.def \
texdev-omllcmm.fd \
texdev-omscmr.fd \
texdev-omscmsy.fd \
texdev-omsenc.def \
texdev-omslcmsy.fd \
texdev-omxcmex.fd \
texdev-omxlcmex.fd \
texdev-openbib.sty \
texdev-ot1cmdh.fd \
texdev-ot1cmfib.fd \
texdev-ot1cmfr.fd \
texdev-ot1cmr.fd \
texdev-ot1cmss.fd \
texdev-ot1cmtt.fd \
texdev-ot1cmvtt.fd \
texdev-ot1enc.def \
texdev-ot1lcmss.fd \
texdev-ot1lcmtt.fd \
texdev-ot4enc.def \
texdev-preload.cfg \
texdev-proc.cls \
texdev-proc.sty \
texdev-report.cls \
texdev-report.sty \
texdev-sample2e.tex \
texdev-sfonts.def \
texdev-shortvrb.sty \
texdev-showidx.sty \
texdev-size10.clo \
texdev-size11.clo \
texdev-size12.clo \
texdev-slides.cls \
texdev-slides.def \
texdev-slides.sty \
texdev-small2e.tex \
texdev-source2edoc.cls \
texdev-structuredlog.sty \
texdev-syntonly.sty \
texdev-t1cmdh.fd \
texdev-t1cmfib.fd \
texdev-t1cmfr.fd \
texdev-t1cmr.fd \
texdev-t1cmss.fd \
texdev-t1cmtt.fd \
texdev-t1cmvtt.fd \
texdev-t1enc.def \
texdev-t1enc.sty \
texdev-t1lcmss.fd \
texdev-t1lcmtt.fd \
texdev-testpage.tex \
texdev-texsys.cfg \
texdev-textcomp-2018-08-11.sty \
texdev-textcomp.sty \
texdev-tracefnt.sty \
texdev-ts1cmr.fd \
texdev-ts1cmss.fd \
texdev-ts1cmtt.fd \
texdev-ts1cmvtt.fd \
texdev-ts1enc.def \
texdev-tuenc.def \
texdev-tulmdh.fd \
texdev-tulmr.fd \
texdev-tulmss.fd \
texdev-tulmssq.fd \
texdev-tulmtt.fd \
texdev-tulmvtt.fd \
texdev-ucmr.fd \
texdev-ucmss.fd \
texdev-ucmtt.fd \
texdev-ulasy.fd \
texdev-ullasy.fd \
texdev-utf8-2018.def \
texdev-utf8.def \
texlive-latex-base-dev"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hypdoc.sty \
tex-hyperref.sty \
tex-l3doc.cls \
tex-url.sty \
texdev-multicol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
