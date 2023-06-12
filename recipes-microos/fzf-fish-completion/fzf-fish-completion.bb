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

PV = "0.41.0"

RPM_NAME = "fzf-fish-completion-0.41.0-1.1.noarch.rpm"
RPM_HASH = "1f43cf477964b27542aa3116004e813ed7a567965ff300710e84ad87cd4fe65b89f93f482303c7d59af93c7e7457e62f26cef70a70159f75eeb7b38e3fcc5479"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fzf-fish-completion"
RDEPENDS:${PN} += "fish fzf"

inherit rpm
