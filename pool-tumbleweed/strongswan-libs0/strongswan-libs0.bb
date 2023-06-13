SUMMARY = "strongSwan core libraries and basic plugins"
DESCRIPTION = "StrongSwan is an IPsec-based VPN solution for Linux. \
 \
This package provides the strongswan library and plugins."
LICENSE = "GPL-2.0-or-later"

PV = "5.9.10"

RPM_NAME = "strongswan-libs0-5.9.10-2.1.aarch64.rpm"
RPM_HASH = "7af2bc5095ac6753ff122698c21c4bd0c72002f6c5638f293e178b6ce77814755b9e11ef90947c507474f99ac136343de679113a22aa11ed36df973155810c3c"

RPROVIDES:${PN} += "config(strongswan-libs0) \
libcharon.so.0()(64bit) \
libimcv.so.0()(64bit) \
libpttls.so.0()(64bit) \
libradius.so.0()(64bit) \
libsimaka.so.0()(64bit) \
libstrongswan-addrblock.so()(64bit) \
libstrongswan-aes.so()(64bit) \
libstrongswan-af-alg.so()(64bit) \
libstrongswan-agent.so()(64bit) \
libstrongswan-attr-sql.so()(64bit) \
libstrongswan-attr.so()(64bit) \
libstrongswan-blowfish.so()(64bit) \
libstrongswan-bypass-lan.so()(64bit) \
libstrongswan-ccm.so()(64bit) \
libstrongswan-certexpire.so()(64bit) \
libstrongswan-cmac.so()(64bit) \
libstrongswan-constraints.so()(64bit) \
libstrongswan-counters.so()(64bit) \
libstrongswan-coupling.so()(64bit) \
libstrongswan-ctr.so()(64bit) \
libstrongswan-curl.so()(64bit) \
libstrongswan-curve25519.so()(64bit) \
libstrongswan-des.so()(64bit) \
libstrongswan-dhcp.so()(64bit) \
libstrongswan-dnskey.so()(64bit) \
libstrongswan-duplicheck.so()(64bit) \
libstrongswan-eap-aka-3gpp2.so()(64bit) \
libstrongswan-eap-aka.so()(64bit) \
libstrongswan-eap-dynamic.so()(64bit) \
libstrongswan-eap-gtc.so()(64bit) \
libstrongswan-eap-identity.so()(64bit) \
libstrongswan-eap-md5.so()(64bit) \
libstrongswan-eap-mschapv2.so()(64bit) \
libstrongswan-eap-peap.so()(64bit) \
libstrongswan-eap-radius.so()(64bit) \
libstrongswan-eap-sim-file.so()(64bit) \
libstrongswan-eap-sim-pcsc.so()(64bit) \
libstrongswan-eap-sim.so()(64bit) \
libstrongswan-eap-simaka-pseudonym.so()(64bit) \
libstrongswan-eap-simaka-reauth.so()(64bit) \
libstrongswan-eap-simaka-sql.so()(64bit) \
libstrongswan-eap-tls.so()(64bit) \
libstrongswan-eap-tnc.so()(64bit) \
libstrongswan-eap-ttls.so()(64bit) \
libstrongswan-farp.so()(64bit) \
libstrongswan-fips-prf.so()(64bit) \
libstrongswan-gcm.so()(64bit) \
libstrongswan-gcrypt.so()(64bit) \
libstrongswan-gmp.so()(64bit) \
libstrongswan-ha.so()(64bit) \
libstrongswan-hmac.so()(64bit) \
libstrongswan-kdf.so()(64bit) \
libstrongswan-kernel-netlink.so()(64bit) \
libstrongswan-ldap.so()(64bit) \
libstrongswan-led.so()(64bit) \
libstrongswan-md4.so()(64bit) \
libstrongswan-md5.so()(64bit) \
libstrongswan-mgf1.so()(64bit) \
libstrongswan-nonce.so()(64bit) \
libstrongswan-openssl.so()(64bit) \
libstrongswan-pem.so()(64bit) \
libstrongswan-pgp.so()(64bit) \
libstrongswan-pkcs1.so()(64bit) \
libstrongswan-pkcs11.so()(64bit) \
libstrongswan-pkcs12.so()(64bit) \
libstrongswan-pkcs7.so()(64bit) \
libstrongswan-pkcs8.so()(64bit) \
libstrongswan-pubkey.so()(64bit) \
libstrongswan-radattr.so()(64bit) \
libstrongswan-random.so()(64bit) \
libstrongswan-rc2.so()(64bit) \
libstrongswan-resolve.so()(64bit) \
libstrongswan-revocation.so()(64bit) \
libstrongswan-sha1.so()(64bit) \
libstrongswan-sha2.so()(64bit) \
libstrongswan-smp.so()(64bit) \
libstrongswan-socket-default.so()(64bit) \
libstrongswan-soup.so()(64bit) \
libstrongswan-sql.so()(64bit) \
libstrongswan-sshkey.so()(64bit) \
libstrongswan-tnc-imc.so()(64bit) \
libstrongswan-tnc-imv.so()(64bit) \
libstrongswan-tnc-pdp.so()(64bit) \
libstrongswan-tnc-tnccs.so()(64bit) \
libstrongswan-tnccs-11.so()(64bit) \
libstrongswan-tnccs-20.so()(64bit) \
libstrongswan-tnccs-dynamic.so()(64bit) \
libstrongswan-unity.so()(64bit) \
libstrongswan-vici.so()(64bit) \
libstrongswan-x509.so()(64bit) \
libstrongswan-xauth-eap.so()(64bit) \
libstrongswan-xauth-generic.so()(64bit) \
libstrongswan-xauth-pam.so()(64bit) \
libstrongswan-xcbc.so()(64bit) \
libstrongswan.so.0()(64bit) \
libtls.so.0()(64bit) \
libtnccs.so.0()(64bit) \
libtpmtss.so.0()(64bit) \
libvici.so.0()(64bit) \
strongswan-libs0 \
strongswan-libs0(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libglib-2.0.so.0()(64bit) \
libgmp.so.10()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpg-error.so.0()(64bit) \
libgpg-error.so.0(GPG_ERROR_1.0)(64bit) \
liblber.so.2()(64bit) \
liblber.so.2(OPENLDAP_2.200)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpcsclite.so.1()(64bit) \
libsoup-2.4.so.1()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_227)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
