SUMMARY = "Apache module for one-time password authentication"
DESCRIPTION = "mod_authn_otp is an Apache web server module for two-factor authentication \
using one-time passwords (OTP) generated via the HOTP/OATH algorithm \
defined in RFC 4226. This creates a simple way to protect a web site with \
one-time passwords, using any RFC 4226-compliant hardware or software \
token device. mod_authn_otp also supports the Mobile-OTP algorithm. \
 \
mod_authn_otp supports both event and time based one-time passwords. It \
also supports 'lingering' which allows the repeated re-use of a previously \
used one-time password up to a configurable maximum linger time. This \
allows one-time passwords to be used directly in HTTP authentication \
without forcing the user to enter a new one-time password for every \
page load. \
 \
mod_authn_otp supports both basic and digest authentication, and will \
auto-synchronize with the user's token within a configurable maximum \
offset (auto-synchronization is not supported with digest authentication). \
 \
mod_authn_otp is especially useful for setting up protected web sites \
that require more security than simple username/password authentication \
yet also don't require users to install special VPN software, and is \
compatible with software tokens that run on cell phones. \
 \
Also included are two command line utilities, otptool and genotpurl. \
otptool is a one-time password command line utility. It can be used \
on a simple call-out basis to integrate two-factor authentication \
into any existing authentication solution. genotpurl generates URLs \
for the Google Authenticator app."
LICENSE = "Apache-2.0"

PV = "1.1.10"

RPM_NAME = "apache2-mod_authn_otp-1.1.10-1.9.aarch64.rpm"
RPM_HASH = "d192e3b5dc3db6c5f88209ea46667075b36a3e9c3f46b77bb9a76163d3b9bca817ffc2ae835f93d7d80fe23e0dca47453808796849cd81d425f4eb23ff8e918e"

RPROVIDES:${PN} += "apache2-mod-authn-otp \
otptool"

RDEPENDS:${PN} += "apache-mmn-20120211 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
suse-maintenance-mmn-0"

inherit rpm
