SUMMARY = "strongSwan core libraries and basic plugins"
DESCRIPTION = "StrongSwan is an IPsec-based VPN solution for Linux. \
 \
This package provides the strongswan library and plugins."
LICENSE = "GPL-2.0-or-later"

PV = "5.9.10"

RPM_NAME = "strongswan-libs0-5.9.10-2.1.aarch64.rpm"
RPM_HASH = "7af2bc5095ac6753ff122698c21c4bd0c72002f6c5638f293e178b6ce77814755b9e11ef90947c507474f99ac136343de679113a22aa11ed36df973155810c3c"

RPROVIDES:${PN} += "config-strongswan-libs0 \
libcharon.so.0 \
libimcv.so.0 \
libpttls.so.0 \
libradius.so.0 \
libsimaka.so.0 \
libstrongswan-addrblock.so \
libstrongswan-aes.so \
libstrongswan-af-alg.so \
libstrongswan-agent.so \
libstrongswan-attr-sql.so \
libstrongswan-attr.so \
libstrongswan-blowfish.so \
libstrongswan-bypass-lan.so \
libstrongswan-ccm.so \
libstrongswan-certexpire.so \
libstrongswan-cmac.so \
libstrongswan-constraints.so \
libstrongswan-counters.so \
libstrongswan-coupling.so \
libstrongswan-ctr.so \
libstrongswan-curl.so \
libstrongswan-curve25519.so \
libstrongswan-des.so \
libstrongswan-dhcp.so \
libstrongswan-dnskey.so \
libstrongswan-duplicheck.so \
libstrongswan-eap-aka-3gpp2.so \
libstrongswan-eap-aka.so \
libstrongswan-eap-dynamic.so \
libstrongswan-eap-gtc.so \
libstrongswan-eap-identity.so \
libstrongswan-eap-md5.so \
libstrongswan-eap-mschapv2.so \
libstrongswan-eap-peap.so \
libstrongswan-eap-radius.so \
libstrongswan-eap-sim-file.so \
libstrongswan-eap-sim-pcsc.so \
libstrongswan-eap-sim.so \
libstrongswan-eap-simaka-pseudonym.so \
libstrongswan-eap-simaka-reauth.so \
libstrongswan-eap-simaka-sql.so \
libstrongswan-eap-tls.so \
libstrongswan-eap-tnc.so \
libstrongswan-eap-ttls.so \
libstrongswan-farp.so \
libstrongswan-fips-prf.so \
libstrongswan-gcm.so \
libstrongswan-gcrypt.so \
libstrongswan-gmp.so \
libstrongswan-ha.so \
libstrongswan-hmac.so \
libstrongswan-kdf.so \
libstrongswan-kernel-netlink.so \
libstrongswan-ldap.so \
libstrongswan-led.so \
libstrongswan-md4.so \
libstrongswan-md5.so \
libstrongswan-mgf1.so \
libstrongswan-nonce.so \
libstrongswan-openssl.so \
libstrongswan-pem.so \
libstrongswan-pgp.so \
libstrongswan-pkcs1.so \
libstrongswan-pkcs11.so \
libstrongswan-pkcs12.so \
libstrongswan-pkcs7.so \
libstrongswan-pkcs8.so \
libstrongswan-pubkey.so \
libstrongswan-radattr.so \
libstrongswan-random.so \
libstrongswan-rc2.so \
libstrongswan-resolve.so \
libstrongswan-revocation.so \
libstrongswan-sha1.so \
libstrongswan-sha2.so \
libstrongswan-smp.so \
libstrongswan-socket-default.so \
libstrongswan-soup.so \
libstrongswan-sql.so \
libstrongswan-sshkey.so \
libstrongswan-tnc-imc.so \
libstrongswan-tnc-imv.so \
libstrongswan-tnc-pdp.so \
libstrongswan-tnc-tnccs.so \
libstrongswan-tnccs-11.so \
libstrongswan-tnccs-20.so \
libstrongswan-tnccs-dynamic.so \
libstrongswan-unity.so \
libstrongswan-vici.so \
libstrongswan-x509.so \
libstrongswan-xauth-eap.so \
libstrongswan-xauth-generic.so \
libstrongswan-xauth-pam.so \
libstrongswan-xcbc.so \
libstrongswan.so.0 \
libtls.so.0 \
libtnccs.so.0 \
libtpmtss.so.0 \
libvici.so.0 \
strongswan-libs0"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libcurl.so.4 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgobject-2.0.so.0 \
libgpg-error.so.0 \
liblber.so.2 \
libldap.so.2 \
libm.so.6 \
libpam.so.0 \
libpcsclite.so.1 \
libsoup-2.4.so.1 \
libsystemd.so.0 \
libxml2.so.2"

inherit rpm
