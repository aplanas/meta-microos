SUMMARY = "Translations for package krb5-auth-dialog"
DESCRIPTION = "Provides translations for the 'krb5-auth-dialog' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.0.alpha1"

RPM_NAME = "krb5-auth-dialog-lang-44.0.alpha1-1.1.noarch.rpm"
RPM_HASH = "426e9120e00d61a6e986935b9ac169293ad13ff6a1e814531d8ac0b858cd12c412836bafd01b0057ee63c740fc97175eef71fe2942c6c422bca54f1b4ddcff2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krb5-auth-dialog-lang \
krb5-auth-dialog-lang-all \
locale(krb5-auth-dialog:bs) \
locale(krb5-auth-dialog:cs) \
locale(krb5-auth-dialog:da) \
locale(krb5-auth-dialog:de) \
locale(krb5-auth-dialog:el) \
locale(krb5-auth-dialog:es) \
locale(krb5-auth-dialog:eu) \
locale(krb5-auth-dialog:fi) \
locale(krb5-auth-dialog:fr) \
locale(krb5-auth-dialog:gl) \
locale(krb5-auth-dialog:hu) \
locale(krb5-auth-dialog:id) \
locale(krb5-auth-dialog:nb) \
locale(krb5-auth-dialog:pa) \
locale(krb5-auth-dialog:pl) \
locale(krb5-auth-dialog:pt) \
locale(krb5-auth-dialog:pt_BR) \
locale(krb5-auth-dialog:ro) \
locale(krb5-auth-dialog:sl) \
locale(krb5-auth-dialog:sr) \
locale(krb5-auth-dialog:sr@latin) \
locale(krb5-auth-dialog:sv) \
locale(krb5-auth-dialog:tr) \
locale(krb5-auth-dialog:uk) \
locale(krb5-auth-dialog:zh_CN) \
locale(krb5-auth-dialog:zh_HK) \
locale(krb5-auth-dialog:zh_TW)"

RDEPENDS:${PN} += "krb5-auth-dialog"

inherit rpm
