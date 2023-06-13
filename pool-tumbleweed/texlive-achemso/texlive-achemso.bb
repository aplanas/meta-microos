SUMMARY = "Support for American Chemical Society journal submissions"
DESCRIPTION = "The bundle provides the official macros (achemso.cls) and \
BibTeX styles (achemso.bst and biochem.bst) for submission to \
the journals of the American Chemical Society. The natmove \
package, which moves citations relative to punctuation, is \
distributed as part of the bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.13fsvn65103"

RPM_NAME = "texlive-achemso-2023.201.3.13fsvn65103-54.1.noarch.rpm"
RPM_HASH = "31e3bd09fcd1e6da45e19013afa6ac8b4db50f86fe75a87d4174e0c14a0d523e8744a5993be115a0fe13dac73d93dc399ee183411f7fbeb58fecb1a2ddacf59b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(achemso-aaembp.cfg) \
tex(achemso-aaemcq.cfg) \
tex(achemso-aamick.cfg) \
tex(achemso-aanmf6.cfg) \
tex(achemso-aapmcd.cfg) \
tex(achemso-aastgj.cfg) \
tex(achemso-abmcb8.cfg) \
tex(achemso-abseba.cfg) \
tex(achemso-acbcct.cfg) \
tex(achemso-accacs.cfg) \
tex(achemso-achre4.cfg) \
tex(achemso-acncdm.cfg) \
tex(achemso-acsccc.cfg) \
tex(achemso-acscii.cfg) \
tex(achemso-acsodf.cfg) \
tex(achemso-aeacb3.cfg) \
tex(achemso-aeacc4.cfg) \
tex(achemso-aeecco.cfg) \
tex(achemso-aelccp.cfg) \
tex(achemso-aesccq.cfg) \
tex(achemso-aewcaa.cfg) \
tex(achemso-afsthl.cfg) \
tex(achemso-aidcbc.cfg) \
tex(achemso-amacgu.cfg) \
tex(achemso-amachv.cfg) \
tex(achemso-amclct.cfg) \
tex(achemso-amlccd.cfg) \
tex(achemso-amlcef.cfg) \
tex(achemso-amrcda.cfg) \
tex(achemso-anaccx.cfg) \
tex(achemso-ancac3.cfg) \
tex(achemso-ancham.cfg) \
tex(achemso-aoiab5.cfg) \
tex(achemso-apcach.cfg) \
tex(achemso-apchd5.cfg) \
tex(achemso-appccd.cfg) \
tex(achemso-asbcd6.cfg) \
tex(achemso-ascecg.cfg) \
tex(achemso-ascefj.cfg) \
tex(achemso-bcches.cfg) \
tex(achemso-bichaw.cfg) \
tex(achemso-bomaf6.cfg) \
tex(achemso-cgdefu.cfg) \
tex(achemso-chreay.cfg) \
tex(achemso-cmatex.cfg) \
tex(achemso-crtoec.cfg) \
tex(achemso-enfuem.cfg) \
tex(achemso-esthag.cfg) \
tex(achemso-estlcu.cfg) \
tex(achemso-iecred.cfg) \
tex(achemso-inoraj.cfg) \
tex(achemso-jaaucr.cfg) \
tex(achemso-jacsat.cfg) \
tex(achemso-jafcau.cfg) \
tex(achemso-jceaax.cfg) \
tex(achemso-jceda8.cfg) \
tex(achemso-jcisd8.cfg) \
tex(achemso-jctcce.cfg) \
tex(achemso-jmcmar.cfg) \
tex(achemso-jnprdf.cfg) \
tex(achemso-joceah.cfg) \
tex(achemso-jpcafh.cfg) \
tex(achemso-jpcbfk.cfg) \
tex(achemso-jpccck.cfg) \
tex(achemso-jpclcd.cfg) \
tex(achemso-jprobs.cfg) \
tex(achemso-langd5.cfg) \
tex(achemso-mamobx.cfg) \
tex(achemso-mpohbp.cfg) \
tex(achemso-nalefd.cfg) \
tex(achemso-oprdfk.cfg) \
tex(achemso-orgnd7.cfg) \
tex(achemso-orlef7.cfg) \
tex(achemso.cls) \
tex(achemso.sty) \
tex(natmove.sty) \
texlive-achemso"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(geometry.sty) \
tex(mciteplus.sty) \
tex(natbib.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
