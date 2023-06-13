SUMMARY = "Allows Perl scripts to directly use Subversion repositories"
DESCRIPTION = "Provides Perl (SWIG) support for Subversion version control system."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-perl-1.14.2-5.3.aarch64.rpm"
RPM_HASH = "afe238b1051a1657be1892667de36ac022185110efc5288483b8cabe4f915edb34fc2f774f058b14d33908ce3993c17f2a37def5950e9b5efea84155487a38df"

RPROVIDES:${PN} += "libsvn_swig_perl-1.so.0()(64bit) \
perl(SVN::Auth::SSL) \
perl(SVN::Base) \
perl(SVN::Client) \
perl(SVN::Client::Summarize) \
perl(SVN::Core) \
perl(SVN::Delta) \
perl(SVN::Delta::Editor) \
perl(SVN::Depth) \
perl(SVN::Error) \
perl(SVN::Fs) \
perl(SVN::Fs::PathChange) \
perl(SVN::MD5) \
perl(SVN::Node) \
perl(SVN::Pool) \
perl(SVN::Ra) \
perl(SVN::Ra::Callbacks) \
perl(SVN::Ra::Reporter) \
perl(SVN::Repos) \
perl(SVN::Stream) \
perl(SVN::Tristate) \
perl(SVN::TxDelta) \
perl(SVN::Wc) \
perl(SVN::Wc::Notify::Action) \
perl(SVN::Wc::Notify::State) \
perl(SVN::Wc::Schedule) \
perl(SVN::Wc::Status) \
perl(_p_apr_pool_t) \
perl(_p_svn_auth_cred_simple_t) \
perl(_p_svn_auth_cred_ssl_client_cert_pw_t) \
perl(_p_svn_auth_cred_ssl_client_cert_t) \
perl(_p_svn_auth_cred_ssl_server_trust_t) \
perl(_p_svn_auth_cred_username_t) \
perl(_p_svn_auth_ssl_server_cert_info_t) \
perl(_p_svn_client_commit_info_t) \
perl(_p_svn_client_commit_item3_t) \
perl(_p_svn_client_ctx_t) \
perl(_p_svn_client_diff_summarize_t) \
perl(_p_svn_client_proplist_item_t) \
perl(_p_svn_commit_info_t) \
perl(_p_svn_config_t) \
perl(_p_svn_dirent_t) \
perl(_p_svn_error_t) \
perl(_p_svn_fs_access_t) \
perl(_p_svn_fs_dirent_t) \
perl(_p_svn_fs_history_t) \
perl(_p_svn_fs_path_change_t) \
perl(_p_svn_fs_root_t) \
perl(_p_svn_fs_t) \
perl(_p_svn_fs_txn_t) \
perl(_p_svn_info_t) \
perl(_p_svn_lock_t) \
perl(_p_svn_log_changed_path2_t) \
perl(_p_svn_log_changed_path_t) \
perl(_p_svn_log_entry_t) \
perl(_p_svn_opt_revision_range_t) \
perl(_p_svn_opt_revision_t) \
perl(_p_svn_opt_revision_value_t) \
perl(_p_svn_ra_session_t) \
perl(_p_svn_stream_t) \
perl(_p_svn_txdelta_op_t) \
perl(_p_svn_txdelta_window_t) \
perl(_p_svn_wc_entry_t) \
perl(_p_svn_wc_external_item2_t) \
perl(_p_svn_wc_status2_t) \
perl(_p_svn_wc_status_t) \
perl(_p_svn_wc_t) \
subversion-perl \
subversion-perl(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libapr-1.so.0()(64bit) \
libc.so.6()(64bit) \
libsvn_client-1.so.0()(64bit) \
libsvn_delta-1.so.0()(64bit) \
libsvn_diff-1.so.0()(64bit) \
libsvn_fs-1.so.0()(64bit) \
libsvn_ra-1.so.0()(64bit) \
libsvn_repos-1.so.0()(64bit) \
libsvn_subr-1.so.0()(64bit) \
libsvn_wc-1.so.0()(64bit) \
perl \
subversion"

inherit rpm
