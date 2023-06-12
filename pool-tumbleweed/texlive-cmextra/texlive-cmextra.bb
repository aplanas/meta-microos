SUMMARY = "Knuth's local information"
DESCRIPTION = "A collection of experimental programs and developments based \
on, or complementary to, the matter in his distribution \
directories."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn57866"

RPM_NAME = "texlive-cmextra-2023.201.svn57866-53.1.noarch.rpm"
RPM_HASH = "c1b604167cd7928c556eb5e87e82568da5e51c090a75dd447435e52e46ee296a129f15692f7a6d333df59a117b9c7540fa95a8628d778ba8375cdcdda9b6a412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bible12.tfm) \
tex(cmbxcd10.tfm) \
tex(cmbxti12.tfm) \
tex(cmbxti7.tfm) \
tex(cmcscsl10.tfm) \
tex(cmfibs8.tfm) \
tex(cmitt12.tfm) \
tex(cmitt9.tfm) \
tex(cmman.tfm) \
tex(cmntex10.tfm) \
tex(cmntt10.tfm) \
tex(cmsl6.tfm) \
tex(cmsltt9.tfm) \
tex(cmssbxo10.tfm) \
tex(cmsslu30.tfm) \
tex(cmssu30.tfm) \
tex(cmsytt10.tfm) \
tex(cmtim.tfm) \
tex(cmvtti10.tfm) \
tex(diam12.tfm) \
tex(gen10.tfm) \
tex(gen8.tfm) \
tex(gen9.tfm) \
texlive-cmextra"
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
