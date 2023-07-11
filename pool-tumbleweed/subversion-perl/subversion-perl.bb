SUMMARY = "Allows Perl scripts to directly use Subversion repositories"
DESCRIPTION = "Provides Perl (SWIG) support for Subversion version control system."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-perl-1.14.2-6.1.aarch64.rpm"
RPM_HASH = "dcaa9747a5be81cc5daa9ba66aa11d8a3c9d9ad0b8a785df1f0fe82d3877213b58d8c85f3ca3d5e1bd2effa09aef4324ab80ab77e7b28a478acc75d7fc4920bf"

RPROVIDES:${PN} += "libsvn-swig-perl-1.so.0 \
perl--p-apr-pool-t \
perl--p-svn-auth-cred-simple-t \
perl--p-svn-auth-cred-ssl-client-cert-pw-t \
perl--p-svn-auth-cred-ssl-client-cert-t \
perl--p-svn-auth-cred-ssl-server-trust-t \
perl--p-svn-auth-cred-username-t \
perl--p-svn-auth-ssl-server-cert-info-t \
perl--p-svn-client-commit-info-t \
perl--p-svn-client-commit-item3-t \
perl--p-svn-client-ctx-t \
perl--p-svn-client-diff-summarize-t \
perl--p-svn-client-proplist-item-t \
perl--p-svn-commit-info-t \
perl--p-svn-config-t \
perl--p-svn-dirent-t \
perl--p-svn-error-t \
perl--p-svn-fs-access-t \
perl--p-svn-fs-dirent-t \
perl--p-svn-fs-history-t \
perl--p-svn-fs-path-change-t \
perl--p-svn-fs-root-t \
perl--p-svn-fs-t \
perl--p-svn-fs-txn-t \
perl--p-svn-info-t \
perl--p-svn-lock-t \
perl--p-svn-log-changed-path-t \
perl--p-svn-log-changed-path2-t \
perl--p-svn-log-entry-t \
perl--p-svn-opt-revision-range-t \
perl--p-svn-opt-revision-t \
perl--p-svn-opt-revision-value-t \
perl--p-svn-ra-session-t \
perl--p-svn-stream-t \
perl--p-svn-txdelta-op-t \
perl--p-svn-txdelta-window-t \
perl--p-svn-wc-entry-t \
perl--p-svn-wc-external-item2-t \
perl--p-svn-wc-status-t \
perl--p-svn-wc-status2-t \
perl--p-svn-wc-t \
perl-SVN--Auth--SSL \
perl-SVN--Base \
perl-SVN--Client \
perl-SVN--Client--Summarize \
perl-SVN--Core \
perl-SVN--Delta \
perl-SVN--Delta--Editor \
perl-SVN--Depth \
perl-SVN--Error \
perl-SVN--Fs \
perl-SVN--Fs--PathChange \
perl-SVN--MD5 \
perl-SVN--Node \
perl-SVN--Pool \
perl-SVN--Ra \
perl-SVN--Ra--Callbacks \
perl-SVN--Ra--Reporter \
perl-SVN--Repos \
perl-SVN--Stream \
perl-SVN--Tristate \
perl-SVN--TxDelta \
perl-SVN--Wc \
perl-SVN--Wc--Notify--Action \
perl-SVN--Wc--Notify--State \
perl-SVN--Wc--Schedule \
perl-SVN--Wc--Status \
subversion-perl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libc.so.6 \
libsvn-client-1.so.0 \
libsvn-delta-1.so.0 \
libsvn-diff-1.so.0 \
libsvn-fs-1.so.0 \
libsvn-ra-1.so.0 \
libsvn-repos-1.so.0 \
libsvn-subr-1.so.0 \
libsvn-wc-1.so.0 \
perl \
subversion"

inherit rpm
