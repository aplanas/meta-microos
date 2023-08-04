SUMMARY = "Translations for package ciano"
DESCRIPTION = "Provides translations for the 'ciano' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "ciano-lang-0.2.4-1.24.noarch.rpm"
RPM_HASH = "9d092c5ba8db3a986f11efdf9a1121e3e61644889a1f9122bbb88bdbc4016a2c0bec1c6d008486d07bbefe163f9b4bd6bba337fca0f1ab5fce7039fdefeeedce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ciano-lang \
ciano-lang-all \
locale-ciano-da \
locale-ciano-es \
locale-ciano-fr \
locale-ciano-lt \
locale-ciano-nl \
locale-ciano-pt \
locale-ciano-pt-BR \
locale-ciano-tr \
locale-ciano-zh-CN"

RDEPENDS:${PN} += "ciano"

inherit rpm
