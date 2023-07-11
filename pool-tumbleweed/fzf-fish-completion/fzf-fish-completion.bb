SUMMARY = "Fish completion for fzf"
DESCRIPTION = "fish shell completions for fzf \
 \
To enable it, ensure you have a file ~/.config/fish/functions/fish_user_key_bindings.fish \
which contains: \
function fish_user_key_bindings \
	fzf_key_bindings \
end \
 \
(or append fzf_key_bindings to the fish_user_key_bindings function if the file already exists)"
LICENSE = "MIT"

PV = "0.42.0"

RPM_NAME = "fzf-fish-completion-0.42.0-1.1.noarch.rpm"
RPM_HASH = "b83c39f554d54f1f2dbc39ca3331e7810bcb0e35b96506361293d0f8d534cb151621de902b023899c548109f118df778b94737bc7e24787a8d289e70b16e387b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fzf-fish-completion"

RDEPENDS:${PN} += "fish \
fzf"

inherit rpm
