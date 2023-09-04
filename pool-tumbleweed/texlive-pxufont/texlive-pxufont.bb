SUMMARY = "Emulate non-Unicode Japanese fonts using Unicode fonts"
DESCRIPTION = "The set of the Japanese logical fonts (JFMs) that are used as \
standard fonts in pTeX and upTeX contains both Unicode JFMs and \
non-Unicode JFMs. This bundle provides an alternative set of \
non-Unicode JFMs that are tied to the virtual fonts (VFs) that \
refer to the glyphs in the Unicode JFMs. Moreover it provides a \
LaTeX package that redefines the NFSS settings of the Japanese \
fonts of (u)pLaTeX so that the new set of non-Unicode JFMs will \
be employed. As a whole, this bundle allows users to dispense \
with the mapping setup on non-Unicode JFMs. Such a setup is \
useful in particular when users want to use OpenType fonts \
(such as Source Han Serif) that have a glyph encoding different \
from Adobe-Japan1, because mapping setups from non-Unicode JFMs \
to such physical fonts are difficult to prepare."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn64072"

RPM_NAME = "texlive-pxufont-2023.209.0.0.6svn64072-54.2.noarch.rpm"
RPM_HASH = "adbc1d2f138c3f7a86ff192cc762be9c96cf4bcaee3ca86c43477a5650bdb0bb9a6ba993711c970700781be6c518f8ffc0028b527de0009c2e28f26525f71ad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxufont-ruby.sty \
tex-pxufont.sty \
tex-zu-brsgnmlgothb-h.tfm \
tex-zu-brsgnmlgothb-h.vf \
tex-zu-brsgnmlgothb-v.tfm \
tex-zu-brsgnmlgothb-v.vf \
tex-zu-brsgnmlgothbn-h.tfm \
tex-zu-brsgnmlgothbn-h.vf \
tex-zu-brsgnmlgothbn-v.tfm \
tex-zu-brsgnmlgothbn-v.vf \
tex-zu-brsgnmlgotheb-h.tfm \
tex-zu-brsgnmlgotheb-h.vf \
tex-zu-brsgnmlgotheb-v.tfm \
tex-zu-brsgnmlgotheb-v.vf \
tex-zu-brsgnmlgothebn-h.tfm \
tex-zu-brsgnmlgothebn-h.vf \
tex-zu-brsgnmlgothebn-v.tfm \
tex-zu-brsgnmlgothebn-v.vf \
tex-zu-brsgnmlgothr-h.tfm \
tex-zu-brsgnmlgothr-h.vf \
tex-zu-brsgnmlgothr-v.tfm \
tex-zu-brsgnmlgothr-v.vf \
tex-zu-brsgnmlgothrn-h.tfm \
tex-zu-brsgnmlgothrn-h.vf \
tex-zu-brsgnmlgothrn-v.tfm \
tex-zu-brsgnmlgothrn-v.vf \
tex-zu-brsgnmlmgothr-h.tfm \
tex-zu-brsgnmlmgothr-h.vf \
tex-zu-brsgnmlmgothr-v.tfm \
tex-zu-brsgnmlmgothr-v.vf \
tex-zu-brsgnmlmgothrn-h.tfm \
tex-zu-brsgnmlmgothrn-h.vf \
tex-zu-brsgnmlmgothrn-v.tfm \
tex-zu-brsgnmlmgothrn-v.vf \
tex-zu-brsgnmlminb-h.tfm \
tex-zu-brsgnmlminb-h.vf \
tex-zu-brsgnmlminb-v.tfm \
tex-zu-brsgnmlminb-v.vf \
tex-zu-brsgnmlminbn-h.tfm \
tex-zu-brsgnmlminbn-h.vf \
tex-zu-brsgnmlminbn-v.tfm \
tex-zu-brsgnmlminbn-v.vf \
tex-zu-brsgnmlminl-h.tfm \
tex-zu-brsgnmlminl-h.vf \
tex-zu-brsgnmlminl-v.tfm \
tex-zu-brsgnmlminl-v.vf \
tex-zu-brsgnmlminln-h.tfm \
tex-zu-brsgnmlminln-h.vf \
tex-zu-brsgnmlminln-v.tfm \
tex-zu-brsgnmlminln-v.vf \
tex-zu-brsgnmlminr-h.tfm \
tex-zu-brsgnmlminr-h.vf \
tex-zu-brsgnmlminr-v.tfm \
tex-zu-brsgnmlminr-v.vf \
tex-zu-brsgnmlminrn-h.tfm \
tex-zu-brsgnmlminrn-h.vf \
tex-zu-brsgnmlminrn-v.tfm \
tex-zu-brsgnmlminrn-v.vf \
tex-zu-cidjgb0-h.tfm \
tex-zu-cidjgb0-h.vf \
tex-zu-cidjgb0-v.tfm \
tex-zu-cidjgb0-v.vf \
tex-zu-cidjgb1-h.tfm \
tex-zu-cidjgb1-h.vf \
tex-zu-cidjgb1-v.tfm \
tex-zu-cidjgb1-v.vf \
tex-zu-cidjgb2-h.tfm \
tex-zu-cidjgb2-h.vf \
tex-zu-cidjgb2-v.tfm \
tex-zu-cidjgb2-v.vf \
tex-zu-cidjgb3-h.tfm \
tex-zu-cidjgb3-h.vf \
tex-zu-cidjgb3-v.tfm \
tex-zu-cidjgb3-v.vf \
tex-zu-cidjgb4-h.tfm \
tex-zu-cidjgb4-h.vf \
tex-zu-cidjgb4-v.tfm \
tex-zu-cidjgb4-v.vf \
tex-zu-cidjgb5-h.tfm \
tex-zu-cidjgb5-h.vf \
tex-zu-cidjgb5-v.tfm \
tex-zu-cidjgb5-v.vf \
tex-zu-cidjge0-h.tfm \
tex-zu-cidjge0-h.vf \
tex-zu-cidjge0-v.tfm \
tex-zu-cidjge0-v.vf \
tex-zu-cidjge1-h.tfm \
tex-zu-cidjge1-h.vf \
tex-zu-cidjge1-v.tfm \
tex-zu-cidjge1-v.vf \
tex-zu-cidjge2-h.tfm \
tex-zu-cidjge2-h.vf \
tex-zu-cidjge2-v.tfm \
tex-zu-cidjge2-v.vf \
tex-zu-cidjge3-h.tfm \
tex-zu-cidjge3-h.vf \
tex-zu-cidjge3-v.tfm \
tex-zu-cidjge3-v.vf \
tex-zu-cidjge4-h.tfm \
tex-zu-cidjge4-h.vf \
tex-zu-cidjge4-v.tfm \
tex-zu-cidjge4-v.vf \
tex-zu-cidjge5-h.tfm \
tex-zu-cidjge5-h.vf \
tex-zu-cidjge5-v.tfm \
tex-zu-cidjge5-v.vf \
tex-zu-cidjgr0-h.tfm \
tex-zu-cidjgr0-h.vf \
tex-zu-cidjgr0-v.tfm \
tex-zu-cidjgr0-v.vf \
tex-zu-cidjgr1-h.tfm \
tex-zu-cidjgr1-h.vf \
tex-zu-cidjgr1-v.tfm \
tex-zu-cidjgr1-v.vf \
tex-zu-cidjgr2-h.tfm \
tex-zu-cidjgr2-h.vf \
tex-zu-cidjgr2-v.tfm \
tex-zu-cidjgr2-v.vf \
tex-zu-cidjgr3-h.tfm \
tex-zu-cidjgr3-h.vf \
tex-zu-cidjgr3-v.tfm \
tex-zu-cidjgr3-v.vf \
tex-zu-cidjgr4-h.tfm \
tex-zu-cidjgr4-h.vf \
tex-zu-cidjgr4-v.tfm \
tex-zu-cidjgr4-v.vf \
tex-zu-cidjgr5-h.tfm \
tex-zu-cidjgr5-h.vf \
tex-zu-cidjgr5-v.tfm \
tex-zu-cidjgr5-v.vf \
tex-zu-cidjmb0-h.tfm \
tex-zu-cidjmb0-h.vf \
tex-zu-cidjmb0-v.tfm \
tex-zu-cidjmb0-v.vf \
tex-zu-cidjmb1-h.tfm \
tex-zu-cidjmb1-h.vf \
tex-zu-cidjmb1-v.tfm \
tex-zu-cidjmb1-v.vf \
tex-zu-cidjmb2-h.tfm \
tex-zu-cidjmb2-h.vf \
tex-zu-cidjmb2-v.tfm \
tex-zu-cidjmb2-v.vf \
tex-zu-cidjmb3-h.tfm \
tex-zu-cidjmb3-h.vf \
tex-zu-cidjmb3-v.tfm \
tex-zu-cidjmb3-v.vf \
tex-zu-cidjmb4-h.tfm \
tex-zu-cidjmb4-h.vf \
tex-zu-cidjmb4-v.tfm \
tex-zu-cidjmb4-v.vf \
tex-zu-cidjmb5-h.tfm \
tex-zu-cidjmb5-h.vf \
tex-zu-cidjmb5-v.tfm \
tex-zu-cidjmb5-v.vf \
tex-zu-cidjmgr0-h.tfm \
tex-zu-cidjmgr0-h.vf \
tex-zu-cidjmgr0-v.tfm \
tex-zu-cidjmgr0-v.vf \
tex-zu-cidjmgr1-h.tfm \
tex-zu-cidjmgr1-h.vf \
tex-zu-cidjmgr1-v.tfm \
tex-zu-cidjmgr1-v.vf \
tex-zu-cidjmgr2-h.tfm \
tex-zu-cidjmgr2-h.vf \
tex-zu-cidjmgr2-v.tfm \
tex-zu-cidjmgr2-v.vf \
tex-zu-cidjmgr3-h.tfm \
tex-zu-cidjmgr3-h.vf \
tex-zu-cidjmgr3-v.tfm \
tex-zu-cidjmgr3-v.vf \
tex-zu-cidjmgr4-h.tfm \
tex-zu-cidjmgr4-h.vf \
tex-zu-cidjmgr4-v.tfm \
tex-zu-cidjmgr4-v.vf \
tex-zu-cidjmgr5-h.tfm \
tex-zu-cidjmgr5-h.vf \
tex-zu-cidjmgr5-v.tfm \
tex-zu-cidjmgr5-v.vf \
tex-zu-cidjml0-h.tfm \
tex-zu-cidjml0-h.vf \
tex-zu-cidjml0-v.tfm \
tex-zu-cidjml0-v.vf \
tex-zu-cidjml1-h.tfm \
tex-zu-cidjml1-h.vf \
tex-zu-cidjml1-v.tfm \
tex-zu-cidjml1-v.vf \
tex-zu-cidjml2-h.tfm \
tex-zu-cidjml2-h.vf \
tex-zu-cidjml2-v.tfm \
tex-zu-cidjml2-v.vf \
tex-zu-cidjml3-h.tfm \
tex-zu-cidjml3-h.vf \
tex-zu-cidjml3-v.tfm \
tex-zu-cidjml3-v.vf \
tex-zu-cidjml4-h.tfm \
tex-zu-cidjml4-h.vf \
tex-zu-cidjml4-v.tfm \
tex-zu-cidjml4-v.vf \
tex-zu-cidjml5-h.tfm \
tex-zu-cidjml5-h.vf \
tex-zu-cidjml5-v.tfm \
tex-zu-cidjml5-v.vf \
tex-zu-cidjmr0-h.tfm \
tex-zu-cidjmr0-h.vf \
tex-zu-cidjmr0-v.tfm \
tex-zu-cidjmr0-v.vf \
tex-zu-cidjmr1-h.tfm \
tex-zu-cidjmr1-h.vf \
tex-zu-cidjmr1-v.tfm \
tex-zu-cidjmr1-v.vf \
tex-zu-cidjmr2-h.tfm \
tex-zu-cidjmr2-h.vf \
tex-zu-cidjmr2-v.tfm \
tex-zu-cidjmr2-v.vf \
tex-zu-cidjmr3-h.tfm \
tex-zu-cidjmr3-h.vf \
tex-zu-cidjmr3-v.tfm \
tex-zu-cidjmr3-v.vf \
tex-zu-cidjmr4-h.tfm \
tex-zu-cidjmr4-h.vf \
tex-zu-cidjmr4-v.tfm \
tex-zu-cidjmr4-v.vf \
tex-zu-cidjmr5-h.tfm \
tex-zu-cidjmr5-h.vf \
tex-zu-cidjmr5-v.tfm \
tex-zu-cidjmr5-v.vf \
tex-zu-goth10.tfm \
tex-zu-goth10.vf \
tex-zu-jis-v.tfm \
tex-zu-jis-v.vf \
tex-zu-jis.tfm \
tex-zu-jis.vf \
tex-zu-jisg-v.tfm \
tex-zu-jisg-v.vf \
tex-zu-jisg.tfm \
tex-zu-jisg.vf \
tex-zu-min10.tfm \
tex-zu-min10.vf \
tex-zu-nmlgothb-h.tfm \
tex-zu-nmlgothb-h.vf \
tex-zu-nmlgothb-v.tfm \
tex-zu-nmlgothb-v.vf \
tex-zu-nmlgothbn-h.tfm \
tex-zu-nmlgothbn-h.vf \
tex-zu-nmlgothbn-v.tfm \
tex-zu-nmlgothbn-v.vf \
tex-zu-nmlgotheb-h.tfm \
tex-zu-nmlgotheb-h.vf \
tex-zu-nmlgotheb-v.tfm \
tex-zu-nmlgotheb-v.vf \
tex-zu-nmlgothebn-h.tfm \
tex-zu-nmlgothebn-h.vf \
tex-zu-nmlgothebn-v.tfm \
tex-zu-nmlgothebn-v.vf \
tex-zu-nmlgothr-h.tfm \
tex-zu-nmlgothr-h.vf \
tex-zu-nmlgothr-v.tfm \
tex-zu-nmlgothr-v.vf \
tex-zu-nmlgothrn-h.tfm \
tex-zu-nmlgothrn-h.vf \
tex-zu-nmlgothrn-v.tfm \
tex-zu-nmlgothrn-v.vf \
tex-zu-nmlmgothr-h.tfm \
tex-zu-nmlmgothr-h.vf \
tex-zu-nmlmgothr-v.tfm \
tex-zu-nmlmgothr-v.vf \
tex-zu-nmlmgothrn-h.tfm \
tex-zu-nmlmgothrn-h.vf \
tex-zu-nmlmgothrn-v.tfm \
tex-zu-nmlmgothrn-v.vf \
tex-zu-nmlminb-h.tfm \
tex-zu-nmlminb-h.vf \
tex-zu-nmlminb-v.tfm \
tex-zu-nmlminb-v.vf \
tex-zu-nmlminbn-h.tfm \
tex-zu-nmlminbn-h.vf \
tex-zu-nmlminbn-v.tfm \
tex-zu-nmlminbn-v.vf \
tex-zu-nmlminl-h.tfm \
tex-zu-nmlminl-h.vf \
tex-zu-nmlminl-v.tfm \
tex-zu-nmlminl-v.vf \
tex-zu-nmlminln-h.tfm \
tex-zu-nmlminln-h.vf \
tex-zu-nmlminln-v.tfm \
tex-zu-nmlminln-v.vf \
tex-zu-nmlminr-h.tfm \
tex-zu-nmlminr-h.vf \
tex-zu-nmlminr-v.tfm \
tex-zu-nmlminr-v.vf \
tex-zu-nmlminrn-h.tfm \
tex-zu-nmlminrn-h.vf \
tex-zu-nmlminrn-v.tfm \
tex-zu-nmlminrn-v.vf \
tex-zu-rubygothb-h.tfm \
tex-zu-rubygothb-h.vf \
tex-zu-rubygothb-v.tfm \
tex-zu-rubygothb-v.vf \
tex-zu-rubygotheb-h.tfm \
tex-zu-rubygotheb-h.vf \
tex-zu-rubygotheb-v.tfm \
tex-zu-rubygotheb-v.vf \
tex-zu-rubygothr-h.tfm \
tex-zu-rubygothr-h.vf \
tex-zu-rubygothr-v.tfm \
tex-zu-rubygothr-v.vf \
tex-zu-rubymgothr-h.tfm \
tex-zu-rubymgothr-h.vf \
tex-zu-rubymgothr-v.tfm \
tex-zu-rubymgothr-v.vf \
tex-zu-rubyminb-h.tfm \
tex-zu-rubyminb-h.vf \
tex-zu-rubyminb-v.tfm \
tex-zu-rubyminb-v.vf \
tex-zu-rubyminl-h.tfm \
tex-zu-rubyminl-h.vf \
tex-zu-rubyminl-v.tfm \
tex-zu-rubyminl-v.vf \
tex-zu-rubyminr-h.tfm \
tex-zu-rubyminr-h.vf \
tex-zu-rubyminr-v.tfm \
tex-zu-rubyminr-v.vf \
tex-zu-tgoth10.tfm \
tex-zu-tgoth10.vf \
tex-zu-tmin10.tfm \
tex-zu-tmin10.vf \
tex-zu-upbrsgnmlgothb-h.tfm \
tex-zu-upbrsgnmlgothb-h.vf \
tex-zu-upbrsgnmlgothb-v.tfm \
tex-zu-upbrsgnmlgothb-v.vf \
tex-zu-upbrsgnmlgothbn-h.tfm \
tex-zu-upbrsgnmlgothbn-h.vf \
tex-zu-upbrsgnmlgothbn-v.tfm \
tex-zu-upbrsgnmlgothbn-v.vf \
tex-zu-upbrsgnmlgotheb-h.tfm \
tex-zu-upbrsgnmlgotheb-h.vf \
tex-zu-upbrsgnmlgotheb-v.tfm \
tex-zu-upbrsgnmlgotheb-v.vf \
tex-zu-upbrsgnmlgothebn-h.tfm \
tex-zu-upbrsgnmlgothebn-h.vf \
tex-zu-upbrsgnmlgothebn-v.tfm \
tex-zu-upbrsgnmlgothebn-v.vf \
tex-zu-upbrsgnmlgothr-h.tfm \
tex-zu-upbrsgnmlgothr-h.vf \
tex-zu-upbrsgnmlgothr-v.tfm \
tex-zu-upbrsgnmlgothr-v.vf \
tex-zu-upbrsgnmlgothrn-h.tfm \
tex-zu-upbrsgnmlgothrn-h.vf \
tex-zu-upbrsgnmlgothrn-v.tfm \
tex-zu-upbrsgnmlgothrn-v.vf \
tex-zu-upbrsgnmlmgothr-h.tfm \
tex-zu-upbrsgnmlmgothr-h.vf \
tex-zu-upbrsgnmlmgothr-v.tfm \
tex-zu-upbrsgnmlmgothr-v.vf \
tex-zu-upbrsgnmlmgothrn-h.tfm \
tex-zu-upbrsgnmlmgothrn-h.vf \
tex-zu-upbrsgnmlmgothrn-v.tfm \
tex-zu-upbrsgnmlmgothrn-v.vf \
tex-zu-upbrsgnmlminb-h.tfm \
tex-zu-upbrsgnmlminb-h.vf \
tex-zu-upbrsgnmlminb-v.tfm \
tex-zu-upbrsgnmlminb-v.vf \
tex-zu-upbrsgnmlminbn-h.tfm \
tex-zu-upbrsgnmlminbn-h.vf \
tex-zu-upbrsgnmlminbn-v.tfm \
tex-zu-upbrsgnmlminbn-v.vf \
tex-zu-upbrsgnmlminl-h.tfm \
tex-zu-upbrsgnmlminl-h.vf \
tex-zu-upbrsgnmlminl-v.tfm \
tex-zu-upbrsgnmlminl-v.vf \
tex-zu-upbrsgnmlminln-h.tfm \
tex-zu-upbrsgnmlminln-h.vf \
tex-zu-upbrsgnmlminln-v.tfm \
tex-zu-upbrsgnmlminln-v.vf \
tex-zu-upbrsgnmlminr-h.tfm \
tex-zu-upbrsgnmlminr-h.vf \
tex-zu-upbrsgnmlminr-v.tfm \
tex-zu-upbrsgnmlminr-v.vf \
tex-zu-upbrsgnmlminrn-h.tfm \
tex-zu-upbrsgnmlminrn-h.vf \
tex-zu-upbrsgnmlminrn-v.tfm \
tex-zu-upbrsgnmlminrn-v.vf \
tex-zu-upnmlgothb-h.tfm \
tex-zu-upnmlgothb-h.vf \
tex-zu-upnmlgothb-v.tfm \
tex-zu-upnmlgothb-v.vf \
tex-zu-upnmlgothbn-h.tfm \
tex-zu-upnmlgothbn-h.vf \
tex-zu-upnmlgothbn-v.tfm \
tex-zu-upnmlgothbn-v.vf \
tex-zu-upnmlgotheb-h.tfm \
tex-zu-upnmlgotheb-h.vf \
tex-zu-upnmlgotheb-v.tfm \
tex-zu-upnmlgotheb-v.vf \
tex-zu-upnmlgothebn-h.tfm \
tex-zu-upnmlgothebn-h.vf \
tex-zu-upnmlgothebn-v.tfm \
tex-zu-upnmlgothebn-v.vf \
tex-zu-upnmlgothr-h.tfm \
tex-zu-upnmlgothr-h.vf \
tex-zu-upnmlgothr-v.tfm \
tex-zu-upnmlgothr-v.vf \
tex-zu-upnmlgothrn-h.tfm \
tex-zu-upnmlgothrn-h.vf \
tex-zu-upnmlgothrn-v.tfm \
tex-zu-upnmlgothrn-v.vf \
tex-zu-upnmlmgothr-h.tfm \
tex-zu-upnmlmgothr-h.vf \
tex-zu-upnmlmgothr-v.tfm \
tex-zu-upnmlmgothr-v.vf \
tex-zu-upnmlmgothrn-h.tfm \
tex-zu-upnmlmgothrn-h.vf \
tex-zu-upnmlmgothrn-v.tfm \
tex-zu-upnmlmgothrn-v.vf \
tex-zu-upnmlminb-h.tfm \
tex-zu-upnmlminb-h.vf \
tex-zu-upnmlminb-v.tfm \
tex-zu-upnmlminb-v.vf \
tex-zu-upnmlminbn-h.tfm \
tex-zu-upnmlminbn-h.vf \
tex-zu-upnmlminbn-v.tfm \
tex-zu-upnmlminbn-v.vf \
tex-zu-upnmlminl-h.tfm \
tex-zu-upnmlminl-h.vf \
tex-zu-upnmlminl-v.tfm \
tex-zu-upnmlminl-v.vf \
tex-zu-upnmlminln-h.tfm \
tex-zu-upnmlminln-h.vf \
tex-zu-upnmlminln-v.tfm \
tex-zu-upnmlminln-v.vf \
tex-zu-upnmlminr-h.tfm \
tex-zu-upnmlminr-h.vf \
tex-zu-upnmlminr-v.tfm \
tex-zu-upnmlminr-v.vf \
tex-zu-upnmlminrn-h.tfm \
tex-zu-upnmlminrn-h.vf \
tex-zu-upnmlminrn-v.tfm \
tex-zu-upnmlminrn-v.vf \
tex-zu-uprubygothb-h.tfm \
tex-zu-uprubygothb-h.vf \
tex-zu-uprubygothb-v.tfm \
tex-zu-uprubygothb-v.vf \
tex-zu-uprubygotheb-h.tfm \
tex-zu-uprubygotheb-h.vf \
tex-zu-uprubygotheb-v.tfm \
tex-zu-uprubygotheb-v.vf \
tex-zu-uprubygothr-h.tfm \
tex-zu-uprubygothr-h.vf \
tex-zu-uprubygothr-v.tfm \
tex-zu-uprubygothr-v.vf \
tex-zu-uprubymgothr-h.tfm \
tex-zu-uprubymgothr-h.vf \
tex-zu-uprubymgothr-v.tfm \
tex-zu-uprubymgothr-v.vf \
tex-zu-uprubyminb-h.tfm \
tex-zu-uprubyminb-h.vf \
tex-zu-uprubyminb-v.tfm \
tex-zu-uprubyminb-v.vf \
tex-zu-uprubyminl-h.tfm \
tex-zu-uprubyminl-h.vf \
tex-zu-uprubyminl-v.tfm \
tex-zu-uprubyminl-v.vf \
tex-zu-uprubyminr-h.tfm \
tex-zu-uprubyminr-h.vf \
tex-zu-uprubyminr-v.tfm \
tex-zu-uprubyminr-v.vf \
tex-zur-gjgb-h.tfm \
tex-zur-gjgb-v.tfm \
tex-zur-gjge-h.tfm \
tex-zur-gjge-v.tfm \
tex-zur-gjgr-h.tfm \
tex-zur-gjgr-v.tfm \
tex-zur-gjmb-h.tfm \
tex-zur-gjmb-v.tfm \
tex-zur-gjmgr-h.tfm \
tex-zur-gjmgr-v.tfm \
tex-zur-gjml-h.tfm \
tex-zur-gjml-v.tfm \
tex-zur-gjmr-h.tfm \
tex-zur-gjmr-v.tfm \
tex-zur-rjgb-h.tfm \
tex-zur-rjgb-v.tfm \
tex-zur-rjge-h.tfm \
tex-zur-rjge-v.tfm \
tex-zur-rjgr-h.tfm \
tex-zur-rjgr-v.tfm \
tex-zur-rjmb-h.tfm \
tex-zur-rjmb-v.tfm \
tex-zur-rjmgr-h.tfm \
tex-zur-rjmgr-v.tfm \
tex-zur-rjml-h.tfm \
tex-zur-rjml-v.tfm \
tex-zur-rjmr-h.tfm \
tex-zur-rjmr-v.tfm \
texlive-pxufont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifuptex.sty \
tex-otf-ujgb-h.tfm \
tex-otf-ujgb-v.tfm \
tex-otf-ujgbn-h.tfm \
tex-otf-ujgbn-v.tfm \
tex-otf-ujge-h.tfm \
tex-otf-ujge-v.tfm \
tex-otf-ujgen-h.tfm \
tex-otf-ujgen-v.tfm \
tex-otf-ujgr-h.tfm \
tex-otf-ujgr-v.tfm \
tex-otf-ujgrn-h.tfm \
tex-otf-ujgrn-v.tfm \
tex-otf-ujmb-h.tfm \
tex-otf-ujmb-v.tfm \
tex-otf-ujmbn-h.tfm \
tex-otf-ujmbn-v.tfm \
tex-otf-ujmgr-h.tfm \
tex-otf-ujmgr-v.tfm \
tex-otf-ujmgrn-h.tfm \
tex-otf-ujmgrn-v.tfm \
tex-otf-ujml-h.tfm \
tex-otf-ujml-v.tfm \
tex-otf-ujmln-h.tfm \
tex-otf-ujmln-v.tfm \
tex-otf-ujmr-h.tfm \
tex-otf-ujmr-v.tfm \
tex-otf-ujmrn-h.tfm \
tex-otf-ujmrn-v.tfm \
tex-upgbm-h.tfm \
tex-upgbm-hq.tfm \
tex-upgbm-v.tfm \
tex-uphgothb-h.tfm \
tex-uphgothb-v.tfm \
tex-uphgothbn-h.tfm \
tex-uphgothbn-v.tfm \
tex-uphgotheb-h.tfm \
tex-uphgotheb-v.tfm \
tex-uphgothebn-h.tfm \
tex-uphgothebn-v.tfm \
tex-uphgothr-h.tfm \
tex-uphgothr-v.tfm \
tex-uphgothrn-h.tfm \
tex-uphgothrn-v.tfm \
tex-uphmgothr-h.tfm \
tex-uphmgothr-v.tfm \
tex-uphmgothrn-h.tfm \
tex-uphmgothrn-v.tfm \
tex-uphminb-h.tfm \
tex-uphminb-v.tfm \
tex-uphminbn-h.tfm \
tex-uphminbn-v.tfm \
tex-uphminl-h.tfm \
tex-uphminl-v.tfm \
tex-uphminln-h.tfm \
tex-uphminln-v.tfm \
tex-uphminr-h.tfm \
tex-uphminr-v.tfm \
tex-uphminrn-h.tfm \
tex-uphminrn-v.tfm \
tex-uprml-h.tfm \
tex-uprml-hq.tfm \
tex-uprml-v.tfm \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
